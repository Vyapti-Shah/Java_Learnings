//WAP to print the sum of following series 1+1/2^2+1/3^2+1/4^2……+1/n^2
import java.util.Scanner;
class Series 
{
 public static void main(String[] args) 
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the limit of series: ");
 int n = sc.nextInt();
 double sum = 0.0;
 for (int i = 1; i <= n; i++) 
 {
 sum += 1.0 / (i * i);
 }
 System.out.println("Sum of the series: " + sum);
 sc.close();
 }
}