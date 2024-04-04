import java.util.Random;
import java.util.Scanner;

public class gessinggame {
    // Méthode principale (point d'entrée du programme)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playagain;
        int maxattempts = 5;
        int roundnum = 0;
        int roundwin = 0;
        int roundlose = 0;
        System.out.println("enter you name");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Number Guessing Game!" + name);
        do {
            // Générer un nombre aléatoire entre 1 et 100
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0; // Attempts in current round

            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            while (attempts < maxattempts) {
                int n = scanner.nextInt();
                attempts++;
                if (n == randomNumber) {
                    System.out.println(
                            "that great you successfully guessed the number in " + attempts + "attempt  you won :)");
                    roundnum++;
                    roundwin++;
                    break;
                } else if (n > randomNumber) {
                    System.out.println("enter a lower number");
                    ;
                } else {
                    System.out.println("enter a highter number");
                }
                if (attempts == maxattempts) {
                    System.out.println("You have exhausted all attempts. The correct number was: " + randomNumber);
                    roundnum++;
                    roundlose++;
                    break;
                }

            }
            System.out.println("do you want to play again(Y/N)");
            scanner.nextLine();
            playagain = scanner.next().charAt(0);
        } while (playagain == 'y' || playagain == 'Y');
        scanner.close();
        System.out.println("game over");
        System.out.println("you have played " + roundnum + "  round");
        System.out.println("you won  " + roundwin + " round :) and you loste  " + roundlose + "  round:(");
    }
}
