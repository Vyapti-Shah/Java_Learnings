public class Interface {
    public static void main(String[] args) {
        //interface- template that can be applied to a class
        //           similar to inheritance, but specifies what a class has/must do
        //           classes can apply more than one interface, inheritance is limited to one superclass
       InterfaceRabbit rabbit= new InterfaceRabbit();
       rabbit.flee(); // as the interface of prey so it can process only the body of that intereface(ie flee)
      
       System.out.println();

       InterfaceHawk hawk=new InterfaceHawk();
       hawk.hunt(); // as the interface of predator so it can process only the body of that intereface(ie hunt)
       
       System.out.println();
       
       InterfaceFish fish=new InterfaceFish();
       fish.flee();
       fish.hunt();
    }
}
