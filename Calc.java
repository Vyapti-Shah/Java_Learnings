//Write a menu driven program using switch case to perform mathematical operations
import java.util.*;
class Calc
{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter First Number : ");
 int a= sc.nextInt();
 System.out.println("Enter Second Number : ");
 int b= sc.nextInt();
 System.out.println("1. Addition");
 System.out.println("2. Subtraction");
 System.out.println("3. Multiplication");
 System.out.println("4. Division");
 System.out.println("5. Remainder");
 System.out.println("Enter The Operation number : ");
 int op=sc.nextInt();
 
 switch(op)
 {
 case 1 : System.out.println("Sum is :"+(a+b));break;
 case 2 : System.out.println("Difference is :"+(a-b));break;
 case 3 : System.out.println("Product is :"+(a*b));break;
 case 4 : System.out.println("Quotient is :"+(a/b));break;
 case 5 : System.out.println("Remainder is :"+(a%b));break;
 default: System.out.println("Invaid operation");
 }
 sc.close();
 }
}