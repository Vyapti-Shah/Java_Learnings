public class Inheritance {
    public static void main(String[] args) {
        InheritanceCar car=new InheritanceCar();
        car.go();//even though we did not list anything in the InheritanceCar class then to as it interited the program fron the InheritanceVehicle so it perfermed the code
        InheritanceBicycle cycle=new InheritanceBicycle();
        cycle.stop();

        System.out.println(car.speed);
        System.out.println(cycle.speed);

        
        
    }
}
