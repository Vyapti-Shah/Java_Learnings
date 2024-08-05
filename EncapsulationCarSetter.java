public class EncapsulationCarSetter {
    private String make;
    private String model;
    private int year;
        EncapsulationCarSetter(String make, String model, int year){
            this.setMake(make);
           this.setModel(model);
           this.setYear(year);
        }
        public String getMake(){
            return make;
        }
        public String getModel(){
            return model;
        }
        public int getYear(){
            return year;
        }
    //setter changes the og output to the present output for the present input given by the user
    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
       this.year=year;
    }
}
