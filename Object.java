public class Object {
    public static void main(String[] args) {
        ObjectCar myCar = new ObjectCar();
        ObjectCar myCar1 = new ObjectCar();
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        myCar.drive();
        myCar.brake();
        System.out.println();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();
    }
}
 //so for object the output for two different class(myCar) is same so to get different output we use constructors

