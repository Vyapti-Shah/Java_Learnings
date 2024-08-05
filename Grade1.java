//WAP to find grade of student from input marks using switch case
import java.util.*;
class Grade1
{
 public static void main(String[] args)
 { 
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Marks(out of 100) : ");
 int avg= sc.nextInt();
 switch (avg / 10)
 {
 case 10:
 case 9:
 System.out.println("A Grade");
 break;
 case 8:
 System.out.println("B Grade");
 break;
 case 7:
 System.out.println("C Grade");
 break;
 case 6:
 System.out.println("D Grade");
 break;
 case 5:
 case 4:
 System.out.println("E Grade");
 break;
 default:
 System.out.println("Fail");
 break;
 }
 sc.close();
 }
}