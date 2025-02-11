package YAIP6;

class MovablePoint implements Movable {
    int x;         // Package-private (aucun modificateur)
    int y;         // Package-private (aucun modificateur)
    int xSpeed;    // Package-private (aucun modificateur)
    int ySpeed;    // Package-private (aucun modificateur)

    // Constructeur
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

