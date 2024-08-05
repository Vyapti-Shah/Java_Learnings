import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num of rows:");
        int row=sc.nextInt();
        System.out.println("Enter num of column:");
        int column=sc.nextInt();
        System.out.println("Enter symbol:");
        String symbol= sc.next();
        int i,j;
        for(i=1;i<=row;i++){
            System.out.println();
            for(j=1;j<=column;j++)
                System.out.print(symbol);
            
        }
        sc.close();
    }
}
