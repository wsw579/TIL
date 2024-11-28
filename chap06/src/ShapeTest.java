class Circle{
    double r;
    Circle(double r){
        this.r = r;
    }

    double getRadius(){
        return r;
    }

    double getArea() {
        return Math.PI * r * r;
    }
}

class Sphere extends Circle{
    Sphere(double r){
        super(r);
    }

    double vol(){
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    double surfArea(){
        return 4 * super.getArea();
    }

    void info(){
        System.out.println("반지름 " + getRadius() + "인 구 부피 " + vol());
        System.out.println("반지름 " + getRadius() + "인 구 표면적" + surfArea());
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Sphere b = new Sphere(10.0);
        b.info();
    }
}
