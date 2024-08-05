import java.util.Scanner;
public class DynamicPolymorphism {
    public static void main(String[] args) {

    //dynamic- after compilation(during runtime)
    //polymorphism- many forms
    // eg:- a Corvette is : a Corvette , a car, a vehicle, and an object
    //dynamic polymorphism- ability of an object to take many forms after compilation when the program is running
  Scanner sc= new Scanner (System.in);
  DynamicPolymorphismAnimal animal;

  System.out.println("What animal do you want?");
  System.out.println("1]Dog");
  System.out.println("2]Cat");
  int choice= sc.nextInt();
  
  if (choice==1){
    animal= new DynamicPolymorphismDog();
    animal.speak();
  } else if(choice==2){
    animal =new DynamicPolymorphismCat();
    animal.speak();
  }else{
    animal =new DynamicPolymorphismAnimal();
    System.out.println("Invalid Input");
    animal.speak();
   }
  sc.close();
 }
}
