public class MethodOverriding {
    public static void main(String[] args) {
        //Method Overriding- declaring a method in subclass which is already present in the parent class done so that the child class can give its own implementation
        MethodOverridingAnimal animal= new MethodOverridingAnimal();
        MethodOverridingDog dog= new MethodOverridingDog();
        dog.speaks();
        animal.speaks();
    }
}
