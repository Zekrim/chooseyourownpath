public class Enemy {
    private Coordinate position;
    private int health;

    Enemy(int x, int y, int health) {
        this.position = new Coordinate(x, y);
        this.health = health;
    }

    Enemy(Coordinate position, int health) {
        this.position = position;
        this.health = health;
    }


    public Coordinate getCoordinate() {
        return position;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public void moveX(int x) {
        this.position.setX(x);
    }

    public void moveY(int y) {
        this.position.setY(y);
    }

    public void move(int x, int y) {
        this.position = new Coordinate(x, y);
    }

    public void move(Coordinate position) {
        this.position = position;
    }
}