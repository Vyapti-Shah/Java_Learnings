public class ToString {
    public static void main(String[] args) {
    ToStringCar car=new ToStringCar();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.colour);
        System.out.println(car.year);
        System.out.println();
        System.out.println(car.toString());//it gives the address as output 
        System.out.println(car);//it gives the address as output 
    }
}
