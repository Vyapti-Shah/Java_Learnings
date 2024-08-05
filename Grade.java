////WAP to find grade of student from input marks using if else ladder
import java.util.Scanner;
class Grade
{
 public static void main(String[] args)
 { 
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Marks(out of 100) : ");
 int avg= sc.nextInt();
 if(avg>90)
 {
 System.out.println("A Grade ");
 }
 else if(avg>80 && avg<90)
 {
 System.out.println(" B Grade");
 } 
 else if(avg>70 && avg<80)
 {
 System.out.println("C Grade");
 }
 else if(avg>60 && avg<70)
 {
 System.out.println("D Grade");
 }
 else if(avg>40 && avg<60)
 {
 System.out.println("D Grade");
 }
 else
 {
 System.out.println("Fail ");
 } 
 sc.close();
 }
}