import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors extends Game {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public RockPaperScissors() {
        super("Rock Paper Scissors");
    }

    public void start() {
        System.out.println("Start rock paper scissors");
    }

    public void play() {
        String again = "yes";

        while (again.equals("yes")) {
            System.out.print("Enter rock, paper, or scissors: ");
            String user = sc.nextLine().toLowerCase();

            int num = r.nextInt(3);
            String com = "";

            if (num == 0) {
                com = "rock";
            } else if (num == 1) {
                com = "paper";
            } else {
                com = "scissors";
            }

            System.out.println("Computer: " + com);

            if (user.equals(com)) {
                System.out.println("tie");
            } else if (user.equals("rock") && com.equals("scissors")) {
                System.out.println("you win");
            } else if (user.equals("paper") && com.equals("rock")) {
                System.out.println("you win");
            } else if (user.equals("scissors") && com.equals("paper")) {
                System.out.println("you win");
            } else if (user.equals("rock") || user.equals("paper") || user.equals("scissors")) {
                System.out.println("computer wins");
            } else {
                System.out.println("wrong input");
            }

            System.out.print("Play again? yes/no: ");
            again = sc.nextLine().toLowerCase();
        }

        end();
    }

    public void end() {
        System.out.println("back to menu");
    }
}