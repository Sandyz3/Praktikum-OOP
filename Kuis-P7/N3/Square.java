public class Square extends Rectangle{

    public Square() {
        super("red", true, 1.0, 1.0);
    }

    public Square(double side) {
        super("red", true, side, side);
    }

    public Square(String color, boolean filled, double width, double lenght) {
        super(color, filled, width, lenght);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }
  
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    public String toString() {
        return "Square["+super.toString()+"], width="+super.getWidth()+",length="+super.getLenght()+"]]";
    }
}

