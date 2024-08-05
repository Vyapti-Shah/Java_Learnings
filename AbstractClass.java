public class AbstractClass {
    public static void main(String[] args) {
        //abstract class- abstract classes cannot be created but they can have a subclass
        AbstractClassCar car=new AbstractClassCar();
        //AbstractClassVehicle vehicle= new AbstractClassVehicle();  we cannot create vehicle instance as it is an abstract class
        car.go();
    }
}
