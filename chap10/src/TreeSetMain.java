import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(3);
        numbers.add(3);
        // TreeSet 자동 정렬
        System.out.println("TreeSet contents" +numbers);

        if(numbers.contains(3)){
            System.out.println("TreeSet contains 3");
        }

        numbers.remove(11);
        System.out.println("TreeSet after removing 11 : " + numbers);

        // 첫번째요소와 마지막요소 접근
        System.out.println("First elements" + numbers.first());
        System.out.println("Last elements" + numbers.last());
    }
}
