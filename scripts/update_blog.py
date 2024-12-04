import feedparser
import git
import os
import re

# 벨로그 RSS 피드 URL
rss_url = 'https://api.velog.io/rss/[victory.one]'

# 깃허브 레포지토리 경로
repo_path = '.'

# 'velog-posts' 폴더 경로
posts_dir = os.path.join(repo_path, 'velog')

# 'velog-posts' 폴더가 없다면 생성
if not os.path.exists(posts_dir):
    os.makedirs(posts_dir)

# 레포지토리 로드
repo = git.Repo(repo_path)

# RSS 피드 파싱
feed = feedparser.parse(rss_url)

# 각 글을 파일로 저장하고 커밋
for entry in feed.entries:
    # 파일 이름에서 유효하지 않은 문자 제거 또는 대체
    file_name = entry.title
    file_name = re.sub(r'[<>:"/\\|?*]', '-', file_name)  # 슬래시, 백슬래시 등의 문자를 대시로 대체
    file_name += '.md'
    file_path = os.path.join(posts_dir, file_name)

    # 파일이 이미 존재하면 이름에 숫자 추가
    if os.path.exists(file_path):
        print(f"File already exists: {file_path}")
        count = 1
        new_file_path = file_path
        while os.path.exists(new_file_path):
            new_file_path = file_path.replace('.md', f'_{count}.md')
            count += 1
        file_path = new_file_path
        print(f"New file path: {file_path}")

    print(f"Creating file: {file_path}")

    # description이 없으면 summary 또는 기본 텍스트를 사용
    if 'description' in entry:
        content = entry.description
    else:
        content = entry.get('summary', 'No description available')  # summary가 없으면 기본 텍스트

    # 글 내용을 파일에 작성
    with open(file_path, 'w', encoding='utf-8') as file:
        file.write(content)

    # 깃허브 커밋
    repo.git.add(file_path)
    repo.git.commit('-m', f'Add post: {entry.title}')

# 변경 사항을 깃허브에 푸시
repo.git.push()
