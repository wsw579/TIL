import java.util.*;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20); // 중복안됨
        numbers.add(30);
        // 정렬안됨
        System.out.println("LinkedHashSet contents : " + numbers);

        if(numbers.contains(20)){
            System.out.println("LinkedHashSet contains 20");
        }

        numbers.remove(20);
        System.out.println("LinkedHashSet after removing 20 contents : " + numbers);

        for(int num : numbers){
            System.out.println("element : " + num);
        }
    }
}
