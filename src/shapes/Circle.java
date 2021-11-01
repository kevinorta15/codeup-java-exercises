package shapes;

public class Circle {
    private int radius;

    public Circle(double radius){

    };
    public double getArea(int radius){
        return Math.PI * (radius^2);
    };
    public double getCircumference(int radius) {
        return 2 * Math.PI * radius;
    }
    
}
