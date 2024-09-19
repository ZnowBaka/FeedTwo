

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //velkomst skærm!
        //Sværhedsgrad
        boolean t = true;
        int userDiff = 0;
        int diffOne = 0;
        int diffTwo = 0;
        int diffThree = 0;
        //User input
        int userNum = 0;
        String userIn = "";

        Welcome(t, userDiff, diffOne, diffTwo, diffThree, userNum, userIn);



    }//end main
        //Welcome msg
    public static void Welcome(boolean t, int userDiff, int diffOne, int diffTwo, int diffThree, int userNum, String userIn){

        System.out.println("Velkommen til gæt et tal" + "\n" + "vælg en sværhedsgrad:");
        Difficulty(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
    }
        //Valg af sværhedsgrad
    public static void Difficulty(int userDiff, boolean t, int diffOne,int diffTwo, int diffThree, int userNum, String userIn){
        Scanner input = new Scanner(System.in);

        System.out.println("1 - let = 0-10:" + "\n" + "2 - mellem = 0-50:" + "\n" + "3 - svær = 0-100:");

        t = true;

        while(t) {

            userDiff = input.nextInt();

            //If til at vælge sværhed

            if (userDiff == 1) {
                System.out.println("Du har valgt Let:");
                t = false;
                GameDiffOne(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
            } else if (userDiff == 2) {
                System.out.println("Du har valgt Mellem:");
                t = false;
                GameDiffTwo(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
            } else if (userDiff == 3) {
                System.out.println("Du har valgt Svær");
                t = false;
                GameDiffThree(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
            } else {
                System.out.println("ugyldigt sværhedsgrad!");
                System.out.println("1 - let = 0-10:" + "\n" + "2 - mellem = 0-50:" + "\n" + "3 - svær = 0-100:");

            }
        }
    }//end Difficulty
    public static void GameDiffOne(int userDiff, boolean t, int diffOne,int diffTwo, int diffThree, int userNum, String userIn){
        Scanner input = new Scanner(System.in);

        System.out.println("gæt et tal fra 0 - 10");
        //Variabler til til let
        t = true;
        diffOne = (int)(Math.random() * 10);
        //Loop til let spil så man kan gætte mere end en gang
        while(t) {

            userNum = input.nextInt();

            if (userNum == diffOne) {
                System.out.println("Du gættede rigtigt");

                t = false;
                    //Retry hvis man gætter tallet
                Retry(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
            } else if (userNum < diffOne){
                System.out.println("Du gættede forkert, prøv højere");
            } else {
                System.out.println("Du gættede forkert, prøv lavere");
            }
        }

    }//end Game one

    public static void GameDiffTwo(int userDiff, boolean t, int diffOne,int diffTwo, int diffThree, int userNum, String userIn){
        Scanner input = new Scanner(System.in);

        t = true;
        diffTwo = (int)(Math.random() * 50);
            //Loop til mellem spil så man kan gætte mere end en gang
        while(t) {

            userNum = input.nextInt();

            if (userNum == diffTwo) {
                System.out.println("Du gættede rigtigt");

                t = false;

                Retry(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);
            } else if (userNum < diffTwo){
                System.out.println("Du gættede forkert, prøv højere");
            } else {
                System.out.println("Du gættede forkert, prøv lavere");
            }
        }


    }//end Game Two

    public static void GameDiffThree(int userDiff, boolean t, int diffOne,int diffTwo, int diffThree, int userNum, String userIn){
        Scanner input = new Scanner(System.in);

        t = true;
        diffThree = (int)(Math.random() * 100);
        //Loop til svær spil så man kan gætte mere end en gang
        while(t) {

            userNum = input.nextInt();

            if (userNum == diffThree) {
                System.out.println("Du gættede rigtigt");

                t = false;

                Retry(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);

            } else if (userNum < diffThree){
                System.out.println("Du gættede forkert, prøv højere");
            } else {
                System.out.println("Du gættede forkert, prøv lavere");
            }
        }

    }//end Game Three


    public static void Retry(int userDiff, boolean t, int diffOne,int diffTwo, int diffThree, int userNum, String userIn){

        Scanner input = new Scanner(System.in);

        System.out.println("Vil du prøve igen, eller lukke programmet?" + "\n" + "ja for at spille videre:" + "\n" + "nej for at slukke:");

        userIn = input.nextLine();
            //switch case som bestemmer om du vil spille igen
        switch (userIn) {

            case "ja":

                Difficulty(userDiff, t, diffOne, diffTwo, diffThree, userNum, userIn);

                break;

            case "nej":

                break;

            default:

                System.out.println("Ugyldigt programmet lukker nu");

                break;
        }

        input.close();

    }//end Retry
}//end class
