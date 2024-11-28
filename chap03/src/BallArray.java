class Ball {
    String name; // 디폴트 (같은패키지, 같은클래스)
    public void setName(String name) {this.name = name;}
    public String getName() {  return name;}
}

public class BallArray {
    public static void main(String[] args) {
        Ball[] balls = new Ball[5];
        // 객체배열
        for(int i = 0; i < 2; i++){
            balls[i] = new Ball();
            balls[i].setName((i+1)+ " 번 Ball ");
        }

        for(Ball ball : balls){
            if(ball != null){
                System.out.println(ball.getName());
            }
            else {
                System.out.println("null");
            }
        }
    }
}
