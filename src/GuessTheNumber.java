import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public GuessTheNumber() {
        super("Guess the Number");
    }

    public void start() {
        System.out.println("Start guess game");
    }

    public void play() {
        int answer = r.nextInt(100) + 1;
        int user = 0;
        int count = 0;

        while (user != answer) {
            System.out.print("Enter a number 1-100: ");
            user = sc.nextInt();
            count++;

            if (user > answer) {
                System.out.println("too high");
            } else if (user < answer) {
                System.out.println("too low");
            } else {
                System.out.println("correct");
                System.out.println("tries: " + count);
            }
        }

        end();
    }

    public void end() {
        System.out.println("back to menu");
    }
}