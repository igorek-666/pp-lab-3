import geometry.Square;

public class Main {
    public static void main(String[] args) {
    Square square = new Square(4.0);

    double pole = square.calculateArea();
    double obwod =  square.calculatePerimeter();

    System.out.println("Pole: " + pole);
    System.out.println("Obwód: " + obwod);
    } 
}