public class ConstructorHuman {
    String name;
    int age;
    double weight;
    ConstructorHuman(String name, int age, double weight){
        this.name=name;//this=object(human1 and human2)
        this.age=age;
        this.weight=weight;
    }
        void eat(){
           System.out.println(this.name+" is eating");
        }
        void drink(){
            System.out.println(this.name+" is drinking");
         }
}
