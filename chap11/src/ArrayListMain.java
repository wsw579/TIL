import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> languges = new ArrayList<>();
        languges.add("Java");
        languges.add("Python");
        languges.add("C++");
        languges.add("JavaScript");
        languges.add("Ruby");

        languges.add(2,"HTML");

        System.out.println("list " + languges);

        System.out.println("특정 인덱스 접근 : " + languges.get(4));

        System.out.println("사이즈 : " + languges.size());

        languges.set(1,"CHANGE");
        languges.remove(1);
        languges.remove("HTML");

        System.out.println("수정 후 사이즈 : " + languges.size());

        if(languges.contains("CHANGE")){
            System.out.println("CHANGE 포함 ");
        }
        System.out.println("list 요소출력");

        for(String lang : languges){
            System.out.println(lang);
        }

        if(languges.isEmpty() == false){
            System.out.println("첫번째 요소는 " + languges.get(0));
        }

        languges.clear();
        System.out.println("list clear , is empty ? " + languges.isEmpty());
    }
}
