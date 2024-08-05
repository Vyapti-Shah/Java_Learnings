// Write a Java program that reads a positive integer from command line and count the number of digits the number (less than ten billion) has.
import java.util.*;
class Counting 
{
 public static void main(String[] args) 
 {
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter number :"); 
 long num=sc.nextLong();
 if (num < 0 || num >= 10_000_000_000L) 
 {
 System.out.println("Invalid input");
 }
 else 
 {
 int count = 0;
 while (num > 0) 
 {
 count++;
 num /= 10;
 }
 System.out.println("Number of digits: " + count);
 } 
 sc.close();
 }
}

