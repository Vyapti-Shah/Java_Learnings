public class ToStringCar {
    String make= "Mercedes";
    String model= "Ben-Z";
    String colour="grey";
    int year= 2024;
    
    //below is the method of overriding where the output displaying address will now display the returned string 
    public String toString(){
        String myString=make+"\n"+model+"\n"+colour+"\n"+year;
        return myString;
        }
}

