package package2;

public class AccessModifierC { //if public is removed from this line(line4) then the body of this class can only be accessed by the classes in the same package and not by the classes of different packages
   
    public String publicMessage="This is a public message";//public access modifier here allows the publicMessage to be accessed in different package also

    protected String protectedMessage="This is a protected message";//protected access modifier (ie protectedMessage) can be accessed by different packages in different class but only if the class is the subclass of the parent class

    private String privateMessage="This is a private message";//private access modifier (ie privateMessage) can be accessed only by the class it is contained in (ie class AccessModifierB) and not by any other class or in any other package
        
    String defaultMessage="This is a default message"; //defaultMessage visible only to that package (ie package2)
}
