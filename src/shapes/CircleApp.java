package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Collecting the circle's radius...");
        double radius = input.getDouble(0, Double.POSITIVE_INFINITY);
        Circle myCircle = new Circle(radius);
        System.out.println("The area of the circle is " + myCircle.getArea());
        System.out.println("The circumference of the circle is " + myCircle.getCircumference());
    }
}
