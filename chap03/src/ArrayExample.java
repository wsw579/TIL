public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = {100,90,80,70,60};

        int sum = 0;

        for (int score : scores) { // for문 이거로 쓰기 !
            sum += score;
        }
        double average = (double) sum/scores.length;

        System.out.println("Average score: " + average);

    }
}
