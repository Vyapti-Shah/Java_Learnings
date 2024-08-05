public class StaticKeywordFriend {
    String name;
    static int numoffriends;//static int
    StaticKeywordFriend(String name){
        this.name=name;
        numoffriends++;
    }
    static void displayfriends(){ //static method
        System.out.println("You have "+numoffriends+" friends");
    }
}
