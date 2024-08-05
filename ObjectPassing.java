public class ObjectPassing {
    public static void main(String[] args) {
        ObjectPassingGarage g= new  ObjectPassingGarage();
        ObjectPassingCar c=new  ObjectPassingCar("BMW");
        ObjectPassingCar c1=new  ObjectPassingCar("Tesla");

        g.park(c);
        g.park(c1);
    }
}
