public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super(1.0, "red");
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius, "red");
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius, "red");
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
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
        return 3.14 * (super.getRadius()*super.getRadius()) * this.height;
    }

    public String toString() {
        return "Cylinder[height="+this.height+",radius="+super.getRadius()+",color="+super.getColor()+"]";
    }
}

