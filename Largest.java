//WAP to find largest of 3 numbers using  nested ternary operator.
import java.util.*;
class Largest
{
 public static void main(String[] args)
{
 int largest;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Number 1: ");
 int a = sc.nextInt();
 System.out.println("Enter Number 2: ");
 int b = sc.nextInt();
 System.out.println("Enter Number 3: ");
 int c = sc.nextInt();
 
 largest = (a > b) ? ((b>c) ? a : c) : ((b >= c) ? b : c);
 System.out.println("Largest number is " + largest);
 sc.close();
}
} 
