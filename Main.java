import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3.5, 2.5);
        Circle circle = new Circle(center, 7.0);
        // Wyświetlanie właściwości koła
        System.out.println("Właściwości koła:");
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Środek: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Obwód: " + circle.calculatePerimeter());
        System.out.println("Pole: " + circle.getArea());
    }
}