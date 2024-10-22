package circulo;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0,"blue");
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle();

        System.out.println("\nc1: \n" + c1 +
                           "Area: "+c1.getArea());
        System.out.println("\nc2: \n" + c2 +
                           "Area: "+c2.getArea());
        System.out.println("\nc3: \n" + c3 +
                           "Area: "+c3.getArea());
    }
}