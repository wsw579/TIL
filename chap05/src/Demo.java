public class Demo {
    // 클래스 필드
    int field;

    public void showDiff(){
        // 메서드 필드
        int local= 7;
        field = local; // 클래스 필드에 지역변수 값 할당

        System.out.println("클래스 필드 " + field);
        System.out.println("메서드 지역변수 "+ local);

    }

    public void changeField(){
        // 다른 메서드에서 클래스 필드 값 변경
        field = 10;
    }

    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showDiff();
        demoInstance.changeField();

        System.out.println("변경된 클래스 필드 " + demoInstance.field);

    }
}
