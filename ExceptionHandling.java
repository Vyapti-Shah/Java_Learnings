import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        //exception- an event that occurs during the excecution of a program 
        //           that distrups the normal flow of instructions
        //           or unexpected events that will stop your program

        Scanner sc= new Scanner(System.in);

    try{ //the whole complex code comes in the try perenthesis(brackets)
         System.out.println("Enter value of a:");
         int a=sc.nextInt();
         System.out.println("Enter value of b:");
         int b=sc.nextInt();
         int z= a/b;
        System.out.println("result="+z);
       }

       //write the type of exception you want to catch in the perinthesis(brackets)
       catch(ArithmeticException e){ // a/0 throws an Arithmethic exception
          System.out.println("Sorry! but You cannot divide a number by zero!");
       }
       catch(InputMismatchException e){ // a/pizza or pizza/b throws a InputMismatch exception
        System.out.println("Sorry! but You can input numbers only!");
       }
       catch(Exception e){ // here all types of exceptions are taken under consideration
        System.out.println("Something went wrong!");
       }
       
       // it will execute whether or not we catch the exception 
       finally{ //also used to close a scanner(if outside the try brackets) or any file 
        System.out.println("THANKYOU (this will always be printed in any case)");
        sc.close();
       }
    }
}
