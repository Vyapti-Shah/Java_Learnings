public class EncapsulationCarGetter {
    //as the access modifier is private so it limits the variable to be accessed inside the class
        private String make;
        private String model;
        private int year;
        EncapsulationCarGetter(String make, String model, int year){
            this.make=make;
            this.model=model;
            this.year=year;
        }
    
    //by using getter or setter we can access the variable outside 
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}  

