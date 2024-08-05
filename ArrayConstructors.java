public class ArrayConstructors {
    public static void main(String[] args) {
       // ArrayConstructorFood[] refrigerator= new ArrayConstructorFood[3];
        
        ArrayConstructorFood food1=new ArrayConstructorFood("pizza");
        ArrayConstructorFood food2=new ArrayConstructorFood("burger");
        ArrayConstructorFood food3=new ArrayConstructorFood("Quasadilla");

        //refrigerator[0]=food1;
        //refrigerator[1]=food2;
        //refrigerator[2]=food3;

        ArrayConstructorFood[] refrigerator= {food1, food2, food3};

        System.out.println(refrigerator[0]);//address output
        System.out.println(refrigerator[0].name);
    }
}
