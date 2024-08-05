public class Encapsulation {
    //encapsulation- attributes of a class will be hidden or private
    //               can be accessed only by some methods (getters and setters)
    //               you should make attributes privte only if you dont have a reason to make them public/protected
    public static void main(String[] args) {
        EncapsulationCarGetter car=new EncapsulationCarGetter("Porsche","911",2023);
        EncapsulationCarSetter car1=new EncapsulationCarSetter("Mercedes","Ben-Z",2024);
        
        System.out.println(car.getMake()); //as the access modifier is private so it does not allow the variable to be accessed outside the class  
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        car1.setYear(2022);//the year changed from 2024 to 2022
        System.out.println(car1.getMake()); //as the access modifier is private so it does not allow the variable to be accessed outside the class  
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        
    }
}
