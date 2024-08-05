//Given an integer, n, perform the following conditional actions:
//• If n is odd, print Weird
//• If n is even and in the inclusive range of 2 to 5, print Not Weird
//• If n is even and in the inclusive range of 6 to 20, print Weird
//• If n is even and greater than 20, print Not Weird

    import java.util.*;

    class Comp
    {
     public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number : ");
     int a = sc.nextInt();
     if(a%2 != 0 )
     {
     System.out.println("Weird");
     }
     else if( a>=2 && a<=5)
     {
     System.out.println("Not Weird");
     }
     else if( 5<a && a<=20)
     {
     System.out.println("Weird");
     }
     else
     {
     System.out.println("Not Weird");
     }
     sc.close();   
    }
}

