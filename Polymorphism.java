public class Polymorphism {
    public static void main(String[] args) {
        //polymorphism- poly(many) and morph(form)
        //              the ability of an object to identify as more than one type
        PolymorphismCar car=new PolymorphismCar();
        PolymorphismBicycle bicycle=new PolymorphismBicycle();
        PolymorphismBoat boat=new PolymorphismBoat();

       // PolymorphismBicycle[] racers= {car,bicycle,boat};  ->>  //PolymorphismBicycle can only store bicycle object and not the car and boat objects
       // PolymorphismBoat[] racers= {car,bicycle,boat};  ->>   //PolymorphismBoat can only store boat object and not the car and bicycle objects
       // PolymorphismCar[] racers= {car,bicycle,boat};  ->>   //PolymorphismCar can only store car object and not the bicycle and boat objects
       // in order to solve the above problem polymorphism is used

       PolymorphismVehicle[] racers={car,bicycle,boat}; //polymorphism
        
       //method1:
       car.go();
       bicycle.go();
       boat.go();
       
       //method2:
       for(PolymorphismVehicle x : racers){
        x.go();
       }

    }
}
