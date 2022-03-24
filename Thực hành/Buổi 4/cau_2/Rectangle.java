public class Rectangle {
    public float width = 1.0f;
    public float height = 1.0f;

    public Rectangle (float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth () {
        return this.width;
    }

    public float getHeight () {
        return this.height;
    }

    public float getArea() {
        return this.height * this.width;
    }

    public float getPerimeter () {
        return (this.height + this.width) * 2;
    }

    public void setWidth (float width) {
        this.width = width;
    }

    public void setHeight (float height) {
        this.height = height;
    }

    public void toStringg () {
        System.out.println("Rectangle[width: " + this.width + ", length:" + this.height + "]");
    }


}
