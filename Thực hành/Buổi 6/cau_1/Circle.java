public class Circle {
    protected double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = 0;
        this.color = "";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * 3.14 * this.radius;
    }

    public String toString() {
        return "Circle";
    }



    
}
