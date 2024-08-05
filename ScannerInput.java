import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("What is your name?");
        String name= sc.nextLine();
        System.out.println("Hey "+name);

        System.out.println("How old are you?");
        int age=sc.nextInt();
        System.out.println("You are "+age+" years old");

        sc.nextLine();//to use sc string user inputs properly and if this is not written then it will not print furthur user input

        System.out.println("What is your fav colour?");
        String fav= sc.nextLine();
        System.out.println("Your fav colour is "+fav);
        sc.close();
    }
}
