import java.util.Scanner;
public class While {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Value of a:");
        int a=sc.nextInt();

        while(a<=10){
            System.out.println("#");
            a++;  
        }
       
        sc.close();
       }
    }
