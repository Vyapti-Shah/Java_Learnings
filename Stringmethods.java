public class Stringmethods {
    public static void main(String[] args) {
        String name= "Vyapti";

        boolean result= name.equals("Vyapti");
        boolean res=name.equals("vyapti");
        boolean r=name.equalsIgnoreCase("vyapti");
        System.out.println(result);
        System.out.println(res);
        System.out.println(r);

        int len=name.length();
        System.out.println(len);

        char l=name.charAt(0);
        System.out.println(l);

        int num= name.indexOf("i");
        System.out.println(num);

        boolean a= name.isEmpty();
        System.out.println(a);

        String surname="";
        boolean b= surname.isEmpty();
        System.out.println(b);

        String cap= name.toUpperCase();
        System.out.println(cap);

        String small= name.toLowerCase();
        System.out.println(small);

        String blanckname="   Vyapti    ";
        String removeblanck= blanckname.trim();
        System.out.println(removeblanck);

        String repl=name.replace('i','o');
        System.out.println(repl);


    }
}
