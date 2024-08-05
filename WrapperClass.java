public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper Class- provides a way to use primitive data types as reference data types
        //reference data types-String [advantages-have useful methods(eg name.toUpperCase)][disadvantages-slow process]
        //primitve data types- int, boolean, double, char
        //wrapper(reference data types)- Integer, Boolean, Double, Character

        //autoboxing- automatic conversion compiler makes from primitive data types and their corresponding object wrapper class
        //unboxing-

        Boolean a= true;
        Character b='@';
        Integer c=123;
        Double d=3.14;
        
        if(a==true){
            System.out.println("This is true");
        }
        if(b=='@')
        {
            System.out.println("true");
        }
        if(c>=100&&c<=150){
            System.out.println("True");
        }
        if(d==3.14){
            System.out.println("Its true");
        }
        
        
    }
}
