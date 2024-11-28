public class StringManipulationDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String searchString = "lo";

        String concatString = str1.concat(str2);
        System.out.println("연결된문자열 " + concatString);

        // indexOf 메서드 사용하여 부분 문자열 인덱스 찾기
        int index = concatString.indexOf(searchString);
        System.out.println(searchString + " 의 인덱스 "  + index);

        boolean isEmpty = str1.isEmpty();
        System.out.println("비어있음  " + isEmpty);

        int length = concatString.length();
        System.out.println("연결된 문자열 길이 " + length);
    }
}
