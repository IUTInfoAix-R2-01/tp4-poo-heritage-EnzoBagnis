package YAIP6;

public class TestMovable {
    public static void main(String[] args) {
        // Création d'un point mobile
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        
        // Affichage de l'état initial
        System.out.println("Position initiale : " + point);

        // Déplacement vers le haut
        point.moveUp();
        System.out.println("Après moveUp() : " + point);

        // Déplacement vers le bas
        point.moveDown();
        System.out.println("Après moveDown() : " + point);

        // Déplacement vers la gauche
        point.moveLeft();
        System.out.println("Après moveLeft() : " + point);

        // Déplacement vers la droite
        point.moveRight();
        System.out.println("Après moveRight() : " + point);
    }
}

