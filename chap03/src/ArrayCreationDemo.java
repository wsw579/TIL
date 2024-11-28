public class ArrayCreationDemo {
    public static void main(String[] args) {
        int [] scoreM1 = {100,90,50,95,85};  // 배열 선언 3가지 방법

        int [] scoreM2 = new int []{100,90,50,95,85};

        int [] scoreM3 ;
        scoreM3 = new int [] {100,90,50,95,85};

        System.out.println("1번방법 ");
        for(int score : scoreM1){
            System.out.print(score+" ");
        }
        System.out.println();

        System.out.println("2번방법 ");
        for(int score : scoreM2){
            System.out.print(score+" ");
        }
        System.out.println();

        System.out.println("3번방법 ");
        for(int score : scoreM3){
            System.out.print(score+" ");
        }
        System.out.println();
    }
}
