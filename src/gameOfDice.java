import java.util.Random;
import java.util.Scanner;

public class gameOfDice {
    public static void main(String[] args){

        int dice1;
        int dice2;
        int score = 0;
        int x;

        Random d = new Random();
        System.out.print("Welcome! Let's Play Roll Dice!");

        Scanner dice = new Scanner(System.in);
        String again = "yes";

        while (again.equalsIgnoreCase("yes")){
            dice1 = (int) (Math.random()*6) + 1;
            //1
            dice2 = (int) (Math.random()*6) + 1;
            //1
            String word = dice.nextLine();
            if (dice1 == 1 || dice2 == 1) {
                score +=0;
            }else if (dice1 == 1 && dice2 ==1){
                score +=25;

            }else{
                score = dice1 + dice2;
            }

            if (score > 100){
                System.out.println("You have scored over 100");
                System.out.println("Thank you for playing");
                break;
            }
            System.out.println("Your rolls " + dice1 + "&" + dice2);
            System.out.println("Score: " + score);
            System.out.println("Roll again?");
            again = dice.next();

            if (again.equalsIgnoreCase("no")){
                System.out.println("Thank you for playing!");
                break;

            }
        }

    }
}
