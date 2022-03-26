import javax.print.attribute.Size2DSyntax;

public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        //code here and correct the return value
        return this.name;
    }

    public String getColor(){
        //code here and correct the return value
        return this.color;
    }

    public double getWidth(){
        //code here and correct the return value
        return this.width;
    }
    public double getLength(){
        //code here and correct the return value
        return this.length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return this.length * this.width;
    }

    public String getType(){
        double size = this.length * this.width;
        if ( size >= 10 ) {
            return "A";
        } else if ( size >= 5 && size < 10 ) {
            return "B";
        } else if ( size < 5 ) {
            return "C";
        }
        return "A";
    }
	
	public boolean isSquare(){
        if ( this.width == this.length ) {
            return true;
        }
        return false;
    }

    public double calDiagonalLine(){
        float len = (float)this.length;
        float wid = (float)this.width;
        return Math.sqrt(len*len + wid*wid);
    }

    public Rectangle resize(double rate){
        this.length *= rate;
        this.width *= rate;
        return null;
    }

    public String toString(){
        String str = "Rectangle[" + this.name + ", " + this.length + ", " + this.width + ", " + this.length * this.width + ", " + this.getType() + "]";
        return str;
    }
}