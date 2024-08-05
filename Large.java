//WAP to find largest of 3 numbers using nested if else 
import java.util.*;
class Large
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
 if(a>b) { 
 if(a>c) {
 largest = a;
 }
 else {
 largest = c;
 }
 }
 else if (b>c) {
 largest = b;
 }
 else { 
 largest = c;
 }
System.out.println("Largest number is " + largest);
sc.close();
}
}

