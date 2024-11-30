class GenericClass <T>{
    private T data;

    public void setData (T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}

public class GenericMain {
    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕 , 제네릭!");
        String data = stringInstance.getData();
        System.out.println(data);

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.setData(10);
        Integer intData = integerInstance.getData();
        System.out.println(intData);

    }
}
