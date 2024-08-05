public class OverloadedConstructors {
    public static void main(String[] args) {
        //overloaded constructors- multiple constructors within a class with the same name but different parameters
        OverloadedConstructorsPizza pizza=new OverloadedConstructorsPizza("Thick crust","mozerella","pepperoni");
        System.out.println("The ingredients are:");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);
        System.out.println(pizza.sauce);
    }
}
