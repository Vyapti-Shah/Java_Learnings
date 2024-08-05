public class Swap {
    public static void main(String[] args){
       int x= 24;
       int y= 5;
       int temp;//empty as no value initialized

       temp=x;
       x=y;
       y=temp;

       System.out.println("x:"+x);
       System.out.println("y:"+y);
    }
}
