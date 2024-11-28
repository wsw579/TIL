public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1 , j = 1 ;

        while(i < 1){ // 조건에 맞지않아 while문 실행 안됨
           System.out.println("while루프 " + i + "번째 반복 실행중 ");
           break;
       }

        System.out.println("while루프 종료 후 변수 i 값은 " + i);

        do{ // 같은 조건이지만 한번은 무조건 실행됨
            System.out.println("do/while 루프" + j + "번째 반복 실행중");
            j++;
        }while (j < 1);

        System.out.println("do/while 루프 종료 후 변수 j 값은 " + j) ;
    }
}
