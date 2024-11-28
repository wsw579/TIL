// 메서드 체이닝(Method Chaining) 예시 = builder 패턴
// 객체를 반환함으로써 메서드를 이어줄 수 있는 방식
// 메서드 체이닝은 객체가 같은 객체를 반환할 때 가장 유용하지만,
// 반환 객체가 달라져도 체이닝은 가능합니다.


public class Person2 {
    private String name;
    private int age;
//    public static Person1 getInstance(){
//        return new Person1();
//    } 이렇게 인스턴스를 리턴해주는 정적메서드
    public Person2 setName(String name) {
        this.name = name;
        return this;
    }
    public Person2 setAge(int age) {
        this.age = age;
        return this; // 현재 객체 반환
    }

    public void Hello(){
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야 ");
    }

    public static void main(String[] args) {
 //        Person1 person1 = Person1.getInstance();
        Person2 person = new Person2();
        person.setName("wsw").setAge(20).Hello();
    }
}
