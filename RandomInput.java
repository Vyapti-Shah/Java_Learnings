import java.util.Random;
;public class RandomInput {
    public static void main(String[] args) {
        Random rm=new Random();
        int x= rm.nextInt(6)+1;//6 aur 1 ke bich mein koi bhi random value print hoga output mein
        int a= rm.nextInt();//-2billion aur 2billion ke bich mein koi bhi random value print hoga output mein
        double y= rm.nextDouble();// 0 aur 1 ke bich mein koi bhi random value print hoga output mein
        boolean z= rm.nextBoolean();// true aur false mein se koi ek print hoga output mein
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
