package package1;


public class AccessModifierB {
    private String privateMessage="This is a private message";
    // private access modifier limited to its own class and package
    public static void main(String[] args) {
        AccessModifierB B=new AccessModifierB();
        System.out.println(B.privateMessage);
    }
}
