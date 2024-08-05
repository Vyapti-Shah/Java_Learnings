import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Value of a:");
        int a=sc.nextInt();

        do{
            System.out.println("#");
            ++a;  
          
        }while(a<=10);
       
        sc.close();
       }
    }
 
