package YAIP6;

public class TestMain {
    public static void main(String[] args) {
        // Test du cercle
        GeometricObject circle = new Circle(5.0);
        System.out.println("Cercle de rayon 5.0");
        System.out.println("Aire : " + circle.getArea());
        System.out.println("Périmètre : " + circle.getPerimeter());
        System.out.println(circle.toString());

        // Test du rectangle
        GeometricObject rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle de largeur 4.0 et longueur 6.0");
        System.out.println("Aire : " + rectangle.getArea());
        System.out.println("Périmètre : " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
