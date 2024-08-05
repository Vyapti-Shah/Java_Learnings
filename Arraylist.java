import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> food= new ArrayList<String>();
        
        food.add("pizza");
        food.add("handburger");
        food.add("hotdog");

        food.set(0,"milk");
        food.remove(3);
        food.clear();
      
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
