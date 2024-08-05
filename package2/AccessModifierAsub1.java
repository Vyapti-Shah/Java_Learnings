package package2;
import package1.*;

public class AccessModifierAsub1 extends AccessModifierA1{
    public static void main(String[] args) {
        AccessModifierAsub1 Asub1=new AccessModifierAsub1();
        System.out.println(Asub1.protectedMessage);//access modifier protected (ie protectedMessage) can be accessed by different packages in different class but only if the class is the subclass of the parent class
        
    }
}
