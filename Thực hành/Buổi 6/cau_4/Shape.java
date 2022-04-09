public class Shape {
    protected String color = "";
    protected boolean filled = true; 

    public Shape() {
        this.color = "";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return this.filled;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "day la toString goc";
    }

}
