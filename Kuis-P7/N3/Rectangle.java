public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(){

    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.lenght * this.width;
    }
    public double getPerimeter(){
        return 2*(this.lenght + this.lenght);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color="+ super.getColor()+",filled="+super.isFilled()+"],width="+this.width+"length="+this.lenght+"]";
    }
    
}
