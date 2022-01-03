public class Player {
    private Coordinate position;
    private int health;
    private Orientation orientation;
    public Player(Coordinate position, int health, Orientation orientation) {
        this.position = position;
        this.health = health;
        this.orientation = orientation;
    }

    public Player(int x, int y, int health, Orientation orientation) {
        this.position = new Coordinate(y, x);
        this.health = health;
        this.orientation = orientation;
    }

    public Player(Coordinate position, int health) {
        this.position = position;
        this.health = health;
        this.orientation = Orientation.EAST;
    }

    public Player(int x, int y, int health) {
        this.position = new Coordinate(y, x);
        this.health = health;
        this.orientation = Orientation.EAST;
    }

    public char getCharacter() {
        switch(orientation) {
            case NORTH:
                return '↑';
            case NORTHEAST:
                return '↗';
            case EAST:
                return '→';
            case SOUTHEAST:
                return '↘';
            case SOUTH:
                return '↓';
            case SOUTHWEST:
                return '↙';
            case WEST:
                return '←';
            default: //Always northwest
                return '↖';
        }
    }

    public void turnLeft() {
        switch(orientation) {
            case NORTH:
                orientation = Orientation.NORTHWEST;
                break;
            case NORTHEAST:
                orientation = Orientation.NORTH;
                break;
            case EAST:
                orientation = Orientation.NORTHEAST;
                break;
            case SOUTHEAST:
                orientation = Orientation.EAST;
                break;
            case SOUTH:
                orientation = Orientation.SOUTHEAST;
                break;
            case SOUTHWEST:
                orientation = Orientation.SOUTH;
                break;
            case WEST:
                orientation = Orientation.SOUTHWEST;
                break;
            default: //Always northwest
                orientation = Orientation.WEST;
        }
    }

    public void turnRight() {
        switch(orientation) {
            case NORTH:
                orientation = Orientation.NORTHEAST;
                break;
            case NORTHEAST:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.SOUTHEAST;
                break;
            case SOUTHEAST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.SOUTHWEST;
                break;
            case SOUTHWEST:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.NORTHWEST;
                break;
            default: // always northwest
                orientation = Orientation.NORTH;
        }
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

    public Orientation getOrientation() {
        return orientation;
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