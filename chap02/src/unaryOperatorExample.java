public class unaryOperatorExample {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(number);
        System.out.println(number++); // 처리는 5,최종적으로 6저장
        System.out.println(++number); // 6전달 , 처리 7, 저장 7
        System.out.println(number);

        int number2 = 5;
        System.out.println(++number2);
    }
}
