import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(5.0, 12.0);
       double pole = rectangle.calculateArea();
       double obwod = rectangle.calculatePerimeter();

       System.out.println("Pole: " + pole);
       System.out.println("Obwód: " + obwod);
    } 
}