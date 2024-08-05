public class SuperKeywordHero extends SuperKeywordPerson{
    String power;
    SuperKeywordHero(String name, int age, String power){
        super(name,age);//super is the keyword used for calling the superclass (ie SuperKeywordPerson)

       // this.name= name;     //as the name and age this work is done by the super() (ie SuperKeywordPerson) 
       // this.age=age;            class so no need to write them here

        this.power=power;//this used for the class in which we are in (ie SuperKeywordHero)
    }
    public String toString(){
        return super.toString()+this.power;
       }
}
