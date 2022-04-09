public class Circle extends Shape {
    protected double radius = 1.0;
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public double getParameter() {
        return this.radius * 2 * 3.14;
    }

    public String toString() {
        return "Da bi override OKe oKE";
    }


}
