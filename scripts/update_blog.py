import feedparser
import git
import os
import re

# 벨로그 RSS 피드 URL
rss_url = 'https://api.velog.io/rss/username'

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
if not feed.entries:
    print("No entries found in RSS feed.")
    exit()

# 각 글을 파일로 저장하고 커밋
for entry in feed.entries:
    # 파일 이름 생성
    file_name = re.sub(r'[<>:"/\\|?*]', '-', entry.title) + '.md'
    file_path = os.path.join(posts_dir, file_name)

    # 파일이 이미 존재하지 않으면 생성
    if not os.path.exists(file_path):
        print(f"Creating file: {file_path}")
        with open(file_path, 'w', encoding='utf-8') as file:
            file.write(entry.description)  # 글 내용을 파일에 작성

        # 깃허브 커밋
        repo.git.add(file_path)
        repo.git.commit('-m', f'Add post: {entry.title}')
    else:
        print(f"File already exists: {file_path}")

# 변경 사항을 깃허브에 푸시
print("Pushing changes...")
repo.git.push()
