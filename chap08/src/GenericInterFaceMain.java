// 제네릭 인터페이스 정의
interface InterfaceGeneric<T>{
    T getValue();
}

// 제네릭 인터페이스를 구현하는 클래스, String 타입으로 구체화
class GenericClass2 implements InterfaceGeneric<String>{

    @Override
    public String getValue(){
        return "일반 값";
    }
}

public class GenericInterFaceMain {
    public static void main(String[] args) {
        GenericClass2 myGenericClass = new GenericClass2();

        String value = myGenericClass.getValue();
        System.out.println(value);
    }
}
