public class OverloadedMethod {
    public static void main(String[] args) {
        //overloaded methods- Methods that share same name but different parameters 
        int x=add(1,2,1,3);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("Overloaded method num 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Overloaded method num 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Overloaded method num 3");
        return a+b+c+d;
    }
}
