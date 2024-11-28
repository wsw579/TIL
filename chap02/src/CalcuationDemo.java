public class CalcuationDemo {
    public static void main(String[] args) {
        int i;
        long l;
        double d;
        double e;

        i = 5/2;
        System.out.println("5/2 = " + i);

        d = 5/(float)2;
        // 5도 2도 정수 , d는 실수형임에도 뒤에서 정수형값가짐
        System.out.println("5/2 = " + d);

        e = 5.0 / 2.0 ;
        System.out.println("5/2 = " + e);
    }
}
