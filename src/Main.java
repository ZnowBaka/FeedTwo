import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //velkomst skærm!
        System.out.println("Velkommen til gæt et tal" + "\n" + "vælg en sværhedsgrad:");

        boolean t = true;
        int userDiff = 0;
        Difficulty(userDiff, t,);
        //Sværhedsgrad
        int diffOne = (int)(Math.random() * 10);
        int diffTwo = (int)(Math.random() * 50);
        int diffThree = (int)(Math.random() * 100);
        //User input
        int userNum = 0;
        String userIn = "";

        Difficulty(userDiff, t, diffOne, diffTwo, diffThree);



    }//end main
    public static void Difficulty(int userDiff, boolean t){
        Scanner input = new Scanner(System.in);

        System.out.println("1 - let = 0-10:" + "\n" + "2 - mellem = 0-50:" + "\n" + "3 - svær = 0-100:");

        while(t) {
            userDiff = input.nextInt();

            //If til at vælge sværhed

            if (userDiff == 1) {
                System.out.println("Du har valgt Let:");
                t = false;
                GameDiffOne(diffOne, userNum, t);
            } else if (userDiff == 2) {
                System.out.println("Du har valgt Mellem:");
                t = false;
            } else if (userDiff == 3) {
                System.out.println("Du har valgt Svær");
                t = false;
            } else {
                System.out.println("ugyldigt sværhedsgrad!");
                System.out.println("1 - let = 0-10:" + "\n" + "2 - mellem = 0-50:" + "\n" + "3 - svær = 0-100:");

            }
        }
    }//end Difficulty
    public static void GameDiffOne(int diffOne, int userNum, boolean t){
        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();
        t = true;
        while(t = true) {
            if (userNum == diffOne) {
                System.out.println("Du gættede rigtigt");
                t = false;
            } else {
                System.out.println("Du gættede forkert, prøv igen.");
            }
        }

    }//end Game
    public static void Guess(int userNum){

    }//end Guess
    public static void Retry(String userIn, int userDiff){

        System.out.println("1 - let = 0-10:" + "\n" + "2 - mellem = 0-50:" + "\n" + "3 - svær = 0-100:");
    }//end Retry
}//end class