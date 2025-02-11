package YAIP6;

public class TestResizableCylinder {
    public static void main(String[] args) {
        // Création d'un cercle de rayon 5
        Circle circle = new Circle(5);
        System.out.println("Circle initial: " + circle);
        System.out.println("Aire: " + circle.getArea());
        System.out.println("Périmètre: " + circle.getPerimeter());

        // Création d'un cercle redimensionnable de rayon 5
        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("\nResizableCircle initial: " + resizableCircle);
        
        // Redimensionner le cercle de 50%
        resizableCircle.resize(150);
        System.out.println("Après redimensionnement (150%) : " + resizableCircle);
        System.out.println("Nouvelle Aire: " + resizableCircle.getArea());
        System.out.println("Nouveau Périmètre: " + resizableCircle.getPerimeter());
    }
}
