import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(3.5, 2.5), 7.0);
        circles[1] = new ColoredCircle(new Point(4.5, 6.0), 8.0, "violet");
        circles[2] = new ColoredCircle(new Point(2.0, 3.5), 10, "pink");

        for (int i = 0; i < circles.length; i++) {
            double area = circles[i].getArea();
            System.out.println("Pole tego koła: " + area);
            if (circles[i] instanceof ColoredCircle) {
                String color = ((ColoredCircle) circles[i]).getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    } 
}