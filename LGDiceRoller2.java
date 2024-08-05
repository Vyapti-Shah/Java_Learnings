import java.util.Random;

public class LGDiceRoller2 {
    Random r;
    int num;
     LGDiceRoller2(int num){
        r= new Random();
        roll();
    }
    void roll(){
       
       num= r.nextInt(6)+1;
       System.out.println(num);
    }
}
//this is the global mehtod
//here we declared the random class in the class brackets and outside the object(LGDiceRoller)
