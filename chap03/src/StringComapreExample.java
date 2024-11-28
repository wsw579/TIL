public class StringComapreExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello World";

        int comparisonResult = str1.compareTo(str2);
        System.out.println("str1과 str2비교:" + comparisonResult);

        boolean equalsResult = str1.equals(str2);
        System.out.println("str1과 str2 같음:" +   equalsResult);

        comparisonResult = str1.compareTo(str3);
        equalsResult = str1.equalsIgnoreCase(str3);

        System.out.println("str1과 str3비교:" + comparisonResult);
        System.out.println("str1과 str3같음:" +   equalsResult);
    }
}
