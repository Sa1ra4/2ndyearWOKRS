package midterms_OOP_DSA_august7;

public class arrays {
    public static void main(String [] args) {
        
        String names[] []={{"mizrael", "tan"},
                          {"mark","tulog","rene"},
                          {"bogart","bibo"}};


        //for (String i : names){
           // System.out.println( "ako si: " + i );
        //}
        //System.out.println("ngalan : " + names [1][2]);

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("ako si: " + names[i][j]);
            }
        }
    } 
}

