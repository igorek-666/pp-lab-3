import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3.5, 2.5);
        ColoredCircle coloredCircle = new ColoredCircle(center, 7.0, "violet");

        // Wyświetlanie właściwości koła
        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Promień: " + coloredCircle.getRadius());
        System.out.println("Środek: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole: " + coloredCircle.getArea());
        //nowa wlasciwiosc - kolor
        System.out.println("Kolor: " + coloredCircle.getColor());

    }
}