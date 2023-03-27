public class Main3 {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Red", true);
        shape1.setColor("Yellow");
        System.out.println(shape1.getColor());
        shape1.setFilled(false);
        System.out.println(shape1.isFilled());
        System.out.println(shape1);

    }
}
