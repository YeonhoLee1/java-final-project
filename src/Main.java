import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GuessTheNumber g1 = new GuessTheNumber();
        RockPaperScissors g2 = new RockPaperScissors();

        int choice = 0;

        while (choice != 3) {
            System.out.println("Welcome to the Java Game Hub");
            System.out.println("------------------------------------------");
            System.out.println("Please select a game you would like to play:");
            System.out.println("1. Guess the Number");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                g1.start();
                g1.play();
            } else if (choice == 2) {
                g2.start();
                g2.play();
            } else if (choice == 3) {
                System.out.println("bye");
            } else {
                System.out.println("invalid choice");
            }

            System.out.println();
        }
    }
}