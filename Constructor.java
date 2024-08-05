public class Constructor {
    public static void main(String[] args) {
        //constructor- method called when object is created , helps us create differernt objects having different attributes
       ConstructorHuman human1= new  ConstructorHuman("Seeta",20,50); //object-human1
       ConstructorHuman human2= new  ConstructorHuman("Geeta",21,52); //object-human2
       System.out.println(human2.age);
       System.out.println(human1.weight);
       human2.eat();
       human1.drink();
    }
}
