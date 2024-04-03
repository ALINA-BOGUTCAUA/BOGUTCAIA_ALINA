package homework_nr_4;

public class Circle {
    float radius;
    public static void main(String[] args) {

        float radius = 3f;
        calculateArea(radius);

        Circle radius1 = new Circle(4f);
        calculateArea(radius1.radius);
    }

    static void calculateArea( float x){
        float result;
        result = x * x * 3.14f ;
        System.out.println("Area =" + result);
    }

    public Circle(float radius) {
        this.radius = radius ;
    }
}
