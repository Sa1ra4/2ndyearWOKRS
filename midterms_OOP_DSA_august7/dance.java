package midterms_OOP_DSA_august7;

public class dance{
    public static void main (String [] args){

        String Genre [] = {"Ballet","Folk dance","Hiphop","Contemporary"};

        String routines [][] = {
                {"grand jete", "plie","degage"}, //ballet
                {"kumintang","hayon-hayon","bilao","lateral position"}, //folk dance
                {"popping", "locking", "breakdancing"}, //hiphop
                {"Floorwork","Improv", "Contradiction"},//contemporary
                 };

        System.out.println("dance");

        for (int i = 0; i < Genre.length; i++) {
            System.out.println("Genre: " + Genre[i]);
        for (int j = 0; j < routines[i].length; j++){
            System.out.println("Routine: "+ routines[i][j] + " ");
        }
        System.out.println(); // print a new line after each genre
    }
        }
        }    
