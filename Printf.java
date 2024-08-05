public class Printf {
    public static void main(String[] args) {
        boolean myBoolean=true;
        char myChar='@';
        String myString="Vyapti";
        int myInt= 123;
        double myDouble=3.14;

        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        System.out.printf("%d is the num\n",myInt);

        System.out.printf("Hello %10s\n",myString);

        System.out.printf("Value of pi %.2f",myDouble);

    }
}
