import java.util.*;

public class HashSetSpeed {
    public static void main(String[] args) {
        int size = 1000000;

        HashSet<Integer> hashSet = new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<size; i++) {
            hashSet.add(i);
            arrayList.add(i);
        }

        // HashSet 검색 시간 측정
        long startTime = System.nanoTime();
        // hashSet에 포함여부 확인
        boolean foundInHashSet = hashSet.contains(size -1);
        long endTime = System.nanoTime();
        long durationHashSet = endTime - startTime;

        System.out.println(foundInHashSet);
        System.out.println(durationHashSet);
    }
}
