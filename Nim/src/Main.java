import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args) {

        int playerInput = 0;
        int botCoin;
        boolean turn = false;
        boolean endGame = false;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int totalCoin  = rand.nextInt(20)+10;
        while (endGame == false) {
            while (!(playerInput <= 3) || !(playerInput >= 1)) {
                System.out.println("take between 1 to 3 coins");
                playerInput = in.nextInt();
                if (playerInput>totalCoin){
                    playerInput = 0;
                }
            }
            turn = false;
            totalCoin = totalCoin - playerInput;
            System.out.println("You take "+playerInput+" coins");
            playerInput = 0;
            System.out.println("There are "+totalCoin+" coins left");

            botCoin = rand.nextInt(3);
            botCoin++;
            if (botCoin>totalCoin) {
                botCoin = totalCoin;
            }
            System.out.println("Bot take "+  botCoin+" coin");
            totalCoin = totalCoin-(botCoin);
            System.out.println(totalCoin);
            turn = true;
            if (totalCoin == 0){
                endGame = true;
            }
        }
        if (turn) {
            System.out.println("You won");
        }
        else {System.out.println("You lost");}
    }
}
