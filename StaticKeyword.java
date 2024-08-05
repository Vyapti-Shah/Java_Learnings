public class StaticKeyword {
    public static void main(String[] args) {
        StaticKeywordFriend friend1= new StaticKeywordFriend("Seeta");
        StaticKeywordFriend friend2= new StaticKeywordFriend("Geeta");

        System.out.println(friend1.name);
        System.out.println(friend2.name);

        System.out.println(StaticKeywordFriend.numoffriends);
        //without having static we will not get the total of friends but onllu get the total of friends only in friend1 or only in friend2

        //calling static methid of the StaticKeywordFriend class below
        StaticKeywordFriend.displayfriends();
    }
}
