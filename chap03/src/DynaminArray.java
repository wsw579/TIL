import java.util.ArrayList;

public class DynaminArray {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        stringList.remove("Python");
        stringList.remove(0);
       // stringList.remove(Integer.valueOf(0)); // 리스트에서 값이 0인 요소를 삭제

        String elementAtIndex = stringList.get(0);

        int size = stringList.size();

        System.out.println("인데스 1의 요소 " + elementAtIndex);
        System.out.println("ArrayList 크기 : " + size);
        System.out.println("ArrayList 현재요소들 : " );
        for(String s : stringList){
            System.out.print(s + " ");
        }

    }
}
