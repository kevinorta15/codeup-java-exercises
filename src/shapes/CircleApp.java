package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input radiusSc = new Input();
        System.out.println("Enter a radius here:");
        double userRadius = radiusSc.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.println(circle.getArea());
    }
}
