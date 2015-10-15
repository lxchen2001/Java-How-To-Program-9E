/*
 *       Filename:  CoinTossing.java
 *
 *    Description:  6.29 - Write an application that simulates coin tossing. Let
 *                  the program toss a coin each time the user chooses the "Toss
 *                  Coin" menu option.
 *                  Count the number of times each side of the coin appears.
 *                  Display the results.
 *                  The program should call a separate method 'flip' that takes no
 *                  arguments and returns a value form a Coin enum (HEADS and
 *                  TAILS).
 *
 *        Created:  14/10/15 18:29:04
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;

public class CoinTossing{
    private static final Random randomFlips = new Random();

    private enum Coin{HEADS, TAILS};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 0 heads 1 tails
        int[] flips = new int[2];
        int count = 0;

        while(true){
            System.out.println("\n1. Toss Coin");
            System.out.println("9. exit");

            if(sc.nextInt() == 9)
                break;

            // flip the coin
            switch(flip()){
                case HEADS:
                    flips[0] += 1;
                    break;
                case TAILS:
                    flips[1] += 1;
                    break;
                default:
                    break;
            }
            count++;
        }

        System.out.printf("%d throws. HEADS: %d. TAILS: %d\n",
                count, flips[0], flips[1]);
    }
    public static Coin flip(){
        return (randomFlips.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
