public class Main {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.setColor("red");
        Cylinder Cylinder1 = new Cylinder(1.0);
        Cylinder Cylinder2 = new Cylinder(1.0,1.0);
        Cylinder Cylinder3 = new Cylinder(1.0,"red",1.0);
        Cylinder[] CylinderArray = {Cylinder1, Cylinder2, Cylinder3};
        for(int i = 0; i<3; i++){
            System.out.println("Cylinder no "+ (i+1));
            CylinderArray[i].setHeight(1.0);
            System.out.println("Height = " + CylinderArray[i].getHeight());
            System.out.println("Volume = " + CylinderArray[i].getVolume());
        }
    }

}