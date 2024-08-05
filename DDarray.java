public class DDarray {
    public static void main(String[] args) {
        String[][] alpha= new String[3][4];//3-num of rows and 4-num of elements in each row or num of columns
        alpha[0][0]="a";
        alpha[0][1]="b";
        alpha[0][2]="c";
        alpha[0][3]="d";
        alpha[1][0]="a1";
        alpha[1][1]="b1";
        alpha[1][2]="c1";
        alpha[1][3]="d1";
        alpha[2][0]="a2";
        alpha[2][1]="b2";
        alpha[2][2]="c2";
        alpha[2][3]="d2";
        for(int i=0;i<alpha.length;i++){
            System.out.println();
            for(int j=0;j<alpha[i].length;j++){
                System.out.print(alpha[i][j]+" ");//+"" just to add space between the strings
            }
        }
    }
}