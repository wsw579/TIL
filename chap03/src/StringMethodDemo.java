public class StringMethodDemo {
    public static void main(String[] args) {
        String originalString = " Java Programming ";

        String subString = originalString.substring(5);
        System.out.println("인덱스5부터 추출" + subString);

        String lowerCaseString = originalString.toLowerCase();
        System.out.println("소문자로변환" + lowerCaseString);

        String upperCaseString = originalString.toUpperCase();
        System.out.println("대문자로변환" + upperCaseString);

        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("거꾸로변환" + reversedString);

        String trimmedString = originalString.trim();
        System.out.println("앞뒤공백제거" + trimmedString);
    }
}
