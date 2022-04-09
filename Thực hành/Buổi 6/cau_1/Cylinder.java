public class Cylinder extends Circle {
    private double height = 1.0;
    
    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return 3.14 * this.radius * this.radius * this.height;
    }

    public String toString() {
        return "da bi ghi de roi oke";
    }
}
