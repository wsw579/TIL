class Ball{
    double radius;

    public Ball(double r ){
        radius = r;
    }

    public void setRadius(double r){
        radius = r;
    }
}

public class Prim {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        b = 20;

        System.out.println(a);
        System.out.println(b);

        Ball myBall = new Ball(4.0);
        Ball yourBall = myBall;
        yourBall.setRadius(5.0);

        System.out.println(myBall.radius);
        System.out.println(yourBall.radius);
    }
}
