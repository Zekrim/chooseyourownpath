public class Coordinate {
    private int x, y;
    private int sizeCap;
    public Coordinate(int x, int y) {
        sizeCap = 16;
        if(x >= 0 && x < sizeCap && y >= 0 && y < sizeCap) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Coordinate(int x, int y, int sizeCap) {
        this.sizeCap = 16;
        if(x >= 0 && x < sizeCap && y >= 0 && y < sizeCap) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setX(int x) {
        if(x >= 0 && x < 16) {
            this.x = x;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setY(int y) {
        if(y >= 0 && y < 16) {
            this.y = y;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
