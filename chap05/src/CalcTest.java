
class Clac{
    private double res;
    static final double PI = 3.14;
    // 완벽하게 상수처럼 사용하기위해 static 붙이기
    // static : 클래스 수준에서 공유되는 변수를 만들기 위해 사용
    // ex) Math.PI 처럼
    // final : 변경 불가능한 값(상수)
    public double area(double rad){
        res = PI * rad * rad;
        return res;
    }

    public static double circ(double rad){
        // res는 사용할 수 없음
        // 왜냐하면 res를 저장할 수 있는 인스턴스 공간이 없기때문에
        // static을 사용하려면 모두 static을 사용해야한다.
        // 일반객체는 static에 접근할 수 있으니ㅏ static은 일반객체에
        // 접근할 수 없다.

        return 2 * PI * rad;
    }
}

public class CalcTest {
    public static void main(String[] args) {
        Clac calc = new Clac();
        double a = calc.area(10);
        double b = Clac.circ(10);
        // static 메서드라 클래스.circ라고 써주기
       // double c = yourcalc.area(20);
        System.out.println("넓이 : " +a);
        System.out.println("둘레 : " +b);
    }
}
