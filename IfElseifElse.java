import java.util.Scanner;
public class IfElseifElse {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter you're age:");
        int age=sc.nextInt();
        
        if(age>1&&age<18){
            System.out.println("Tennager");
        }else if(age>=18&&age<65){
            System.out.println("Adult");
        }else if(age>=65){
            System.out.println("Old Age");
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
        }
        }
        //&&-both condition to be satisfied
        //||-any one to be satisfied
        //!-not equal
        //==-equal