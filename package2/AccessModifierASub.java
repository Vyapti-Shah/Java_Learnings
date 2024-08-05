package package2;
import package1.*;

public class AccessModifierASub extends AccessModifierA{ 
    
    //even though it is a child class of AccessModifierA of package1 then too due to default access modifier AccessModifierA cannot access it becoz of difference in the packages
    public static void main(String[] args) {
        AccessModifierC C=new AccessModifierC();
        System.out.println(C.defaultMessage);
    }
}
