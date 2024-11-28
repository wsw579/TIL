public class ArrayAccessDemo {
    public static void main(String[] args) {
        int [] scores = {100, 90 ,80, 70 ,60};
        int first = scores[0];

        System.out.println("첫번째 " + first);

        int last = scores[scores.length-1];
        System.out.println("마지막 " + last);

        System.out.println("배열의 크기 "+ scores.length);

        System.out.println("배열의 모든 원소:");
        for(int i = 0 ; i<scores.length; i++){
            System.out.print("원소" + i + ':' + scores[i]  + " " );
        }
    }
}
