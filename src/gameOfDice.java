import java.util.Random;
import java.util.Scanner;

public class gameOfDice {
    public static void main(String[] args){

        int dice1;
        int dice2;
        int score = 0;
        int x;

        Random rand = new Random();
        System.out.print("Welcome! Let's Play Roll Dice!");

        Scanner dice = new Scanner(System.in);
        String again = "yes";

        while (again.equalsIgnoreCase("yes")){
            dice1 = 1 + rand.nextInt(6);
            dice2 = 1 + rand.nextInt(6);

            if (dice1 == 1 && dice2 == 1) {
                score +=25;
            }else if (dice1 == 1 || dice2 ==1){
                score +=0;

            }else{
                score = dice1 + dice2;
            }

            if (score > 100){
                System.out.println("You have scored over 100");
                System.out.println("Thank you for playing");
                break;
            }
            System.out.println("Your rolls " + dice1 + " & " + dice2);
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
