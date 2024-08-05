import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       System.out.println("Enter value of x:");
       int x=sc.nextInt(); 
       System.out.println("Value of x="+x);
       System.out.println("Enter value of y:");
       int y=sc.nextInt(); 
       System.out.println("Value of y="+y);
       System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Remainder\nChoose your Arithmatic Operator:");
       int a=sc.nextInt();  
       switch(a){
        case 1:
        System.out.println("Addition="+(x+y));
        break;
        case 2:
        System.out.println("Subtraction="+(x-y));
        break;
        case 3:
        System.out.println("Multiplication="+(x*y));
        break;
        case 4:
        System.out.println("Division="+(x/y));
        break;
        case 5:
        System.out.println("Remainder="+(x%y));
        break;
        default:
        System.out.println("Invalid Input");
        break;
        }
     sc.close();
    }
}
