package package1;
import package2.*;

public class AccessModifierA {
    public static void main(String[] args) {
        AccessModifierC C=new AccessModifierC();
        System.out.println(C.publicMessage);

    }
}
