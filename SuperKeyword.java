public class SuperKeyword {
    public static void main(String[] args) {
        //Super Keyword- refers to the superclass(parent class) of an object very similar to the "this" keyword
        SuperKeywordHero hero= new SuperKeywordHero("Iron Man",40,"$$$");
        SuperKeywordHero hero1= new SuperKeywordHero("Thor",10000,"$$$$$");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);
        System.out.println();
        System.out.println(hero1.toString());
    }
}
