import java.util.Random;
import java.util.Scanner;

public class guessing_game {

    public static void main (String [] args){


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;
        int randomNumber =  random.nextInt(min, max + 1);

        System.out.println("Number guessing game");
        System.out.printf("Guess the no. between %d to %d\n",min,max );

        do {
            System.out.print("Enter guess no. ");
            guess = scanner.nextInt();

            if (guess<randomNumber){
                System.out.println("Too Low! Try again.");
            } else if (guess>randomNumber){

                System.out.println("Too High! Try again.");
            }else {
                System.out.println("Corrcet! The no. was "+randomNumber);
                System.out.println("no. of attempts: "+attempt);
            }
        }while (guess != randomNumber);

        scanner.close();

    }

}
