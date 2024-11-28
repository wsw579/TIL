public class MultDimensionArrayDemo {
    public static void main(String[] args) {
        int [][] scores = {
                {100,90,80,70,60},
                {50,40,30,20,10},
                {80,90,80,70,60}
        };

        int firstRowFirstCol = scores[0][0];
        System.out.println(firstRowFirstCol);

        int secondRowThirdCol = scores[1][2];
        System.out.println(secondRowThirdCol);

        System.out.println("2차원배열의 크기(=2차원배열의 행의수) " + scores.length);
        System.out.println("첫번째 행의 크기(=2차원배열의 열의수)"+ scores[0].length);
        System.out.println("전체원소의 수 : " + (scores.length * scores[0].length));
        System.out.println("2차원배열의 모든정수");
        for (int[] score : scores) { // scores의 각 행(즉, 1차원 배열)을 순회
            for (int i : score) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
