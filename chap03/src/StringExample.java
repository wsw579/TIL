public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello World";
        System.out.println(greeting);

        String name = new String("java 사용자");
        System.out.println(name);

        // 문자 배열을 사용해 문자열 생성
        char[] charArray = {'J' , 'a' , 'v' ,'a' , ' ' , '프' , '로' , '그' , '래' , '머' } ;
        String programmer = new String(charArray);
        // String 객체 변수에 char형 배열을 넣을 수 있다.
        System.out.println(programmer);

        // 문자열 연결
        String fullName = "kim" +" "+ "Young";
        System.out.println(fullName);

        // stringBuilder 를 사용하여 문자열 생성 및 연결
        StringBuilder  sb = new StringBuilder();
        sb.append("문자열").append("생성").append("예제");
        String result = sb.toString(); // String
        System.out.println(result);

    }
}
