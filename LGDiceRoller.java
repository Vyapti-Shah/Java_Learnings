import java.util.Random;
public class LGDiceRoller {
    LGDiceRoller(){
        Random r= new Random();
        int num=0;
        roll(r,num);
    }
    void roll(Random r,int num){
       num= r.nextInt(6)+1;
       System.out.println(num);
    }
}
//this is the local method 
//as the random and int are local methods so they were needed to be declared again outside the LGDiceRoller class file

