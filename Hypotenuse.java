import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of lenght:");
        int a= sc.nextInt();
        System.out.println("lenght="+a);
        System.out.println("Enter value of breadth:");
        int b= sc.nextInt();
        System.out.println("Breadth="+b);
        double hypo=Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse="+hypo);
        sc.close();
    }
}
