public class CtrlFlow {
    public static void main(String[] args) {
        int n =1 , s = 0;
        // 무한루프에서 100까지 숫자를 합산하고 루프 탈출
        while(true){
            s += n;
            if(n == 100){
                break;
            }
            n++;
        }
        System.out.println(s);

        for(int i =0; i <= 100; i++){
            if(!(i%5 == 0 || i%7 == 0)){
                continue;
            }
            System.out.println(i + "는 5 또는 7의 배수 입니다. ");
        }

    }
}
