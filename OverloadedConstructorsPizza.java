public class OverloadedConstructorsPizza {
    String bread;
    String cheese;
    String toppings;
    String sauce;
    OverloadedConstructorsPizza(){

    }

    OverloadedConstructorsPizza(String bread){
        this.bread=bread;
    }

    OverloadedConstructorsPizza(String bread,String cheese){
        this.bread=bread;
        this.cheese=cheese;
    }

    OverloadedConstructorsPizza(String bread,String cheese,String toppings){
        this.bread=bread;
        this.cheese=cheese;
        this.toppings=toppings;
    }
    
    OverloadedConstructorsPizza(String bread,String cheese,String toppings,String sauce){
        this.bread=bread;
        this.cheese=cheese;
        this.toppings=toppings;
        this.sauce=sauce;
    }
}
