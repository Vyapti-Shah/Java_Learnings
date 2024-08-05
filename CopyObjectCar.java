public class CopyObjectCar {
    private String make;
    private String model;
    private int year;
        CopyObjectCar(String make, String model, int year){
            this.setMake(make);
           this.setModel(model);
           this.setYear(year);
        }
        CopyObjectCar(CopyObjectCar x){
         this.copy(x);
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
    public void copy(CopyObjectCar x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
