public class CopyObject { //the address should change when one car has been copied to other car
    public static void main(String[] args) {
        CopyObjectCar car1 =new CopyObjectCar("Rolls Royce","Phantom",2022);
        CopyObjectCar car2 =new CopyObjectCar("Mustang","GT",2023);
        CopyObjectCar car3=new CopyObjectCar(car2);
        car2.copy(car1);

        System.out.println(car1); //address
        System.out.println(car2); //address
        System.out.println(car3); //address
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
