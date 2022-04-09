public class Square extends Rectangle {
    protected double side = 1.0 ;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        super(color, filled);
    }

    public String toString() {
        return "Square" + this.side  + this.filled + this.color;
    }

}
