// Stone Paper Scissor Game

import java.util.*;

public class s_p_s_game {

    public static void main(String arg[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        while (true) {
            System.out.println("This is Stone-Paper-Scissor Game.");
            // System.out.println("Enjoy your Game");
            System.out.println("For choice \n1. Stone\n2. Paper\n3. Scissor");
            System.out.println("We will have FIVE ROUNDS.");
            System.out.println("let's start the game :");
            int count = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter choice : ");
                int n = sc.nextInt();
                int x = ran.nextInt(3);

                // System.out.println(x);

                if (0 < n & n < 4) {
                    System.out.print("You choose ");
                    switch (n) {
                        case 1:
                            System.out.println("Stone");
                            break;
                        case 2:
                            System.out.println("Paper");
                            break;
                        case 3:
                            System.out.println("Scissor");
                            break;
                    }
                    System.out.print("I choose ");
                    switch (x) {
                        case 0:
                            System.out.println("Stone");
                            break;
                        case 1:
                            System.out.println("Paper");
                            break;
                        case 2:
                            System.out.println("Scissor");
                            break;
                    }
                    if (x == 0 & (n == 1 | n == 2)) {
                        System.out.println("You Win.");
                    } else if (x == 1 & (n == 2 | n == 3)) {
                        System.out.println("You Win.");
                    } else if (x == 2 & (n == 3 | n == 1)) {
                        System.out.println("You Win.");
                    } else {
                        System.out.println("I Win.");
                        count++;
                    }
                } else {
                    System.out.println("Enter Valid Choice : 1 for Stone, 2 for Paper, 3 for Scissor");
                }
            }
            System.out.println("Final Result : " + (5 - count) + " Wins.");
            if (count < 3) {
                System.out.println("SORRY I WIN THE GAME\nLET'S PLAY AGAIN.");
            } else {
                System.out.println("CONGARTULATIONS YOU WIN THE GAME\nLET'S PLAY AGAIN.");
            }
            Thread.sleep(5000);
            System.out.println("\n");
        }
    }

}
