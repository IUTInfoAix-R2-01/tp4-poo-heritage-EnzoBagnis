package YAIP5;

public class TestCylinder {
    public static void main(String[] args) {
        // Création d'un cercle
        Circle circle = new Circle(5.0, "Red");
        System.out.println("Cercle : " + circle);
        
        // Création d'un cylindre utilisant ce cercle comme base
        Cylinder cylinder = new Cylinder(circle, 10.0);
        System.out.println("Cylindre : " + cylinder);
        
        // Vérification des méthodes get et set
        cylinder.setHeight(15.0);
        System.out.println("Nouvelle hauteur du cylindre : " + cylinder.getHeight());

        cylinder.getBase().setRadius(7.0);
        System.out.println("Nouveau rayon du cercle : " + cylinder.getBase().getRadius());

        cylinder.getBase().setColor("Blue");
        System.out.println("Nouvelle couleur du cercle : " + cylinder.getBase().getColor());
    }
}

