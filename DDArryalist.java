import java.util.ArrayList;
public class DDArryalist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList= new ArrayList<ArrayList<String>>();
        ArrayList<String> backeryList= new ArrayList<String>();
        backeryList.add("pasta");
        backeryList.add("burger");
        backeryList.add("donuts");

        ArrayList<String> productList= new ArrayList<String>();
        productList.add("tomato");
        productList.add("origano");
        productList.add("cheese");

        ArrayList<String> drinkList= new ArrayList<String>();
        drinkList.add("coffee");
        drinkList.add("cool");
       
        System.out.println(backeryList);
        System.out.println(productList);
        System.out.println(drinkList);

        groceryList.add(backeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);

        System.out.println(groceryList);

        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
    }
}
