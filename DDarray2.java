public class DDarray2 {
    public static void main(String[] args) {
        String[][] alpha={ {"a","b","c"},
                           {"a1","b1","c1"}, 
                           {"a2","b2","c2"} }; 
     for(int i=0;i<alpha.length;i++){
     System.out.println();
     for(int j=0;j<alpha[i].length;j++){
        System.out.print(alpha[i][j]+" ");//+"" just to add space between the strings
      }
     }    
    }
}
