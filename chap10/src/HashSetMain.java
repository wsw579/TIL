import java.util.HashSet;
// Hashset - 중복안됨 , 순서보장안함

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        boolean isAdded = numbers.add(4);
        // 이미 3이 추가되어있으니까 false 반환

        System.out.println("Hashset contents: " + numbers);
        System.out.println("4 add again : " +isAdded);

        // 요소 순서 보장하지않음
        numbers.add(2);
        numbers.add(1);
        System.out.println("Hashset after adding more contents: " + numbers);

    }
}
