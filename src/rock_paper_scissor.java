import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {

    public static void main(String[] args){

        String[] choices={"rock","paper","scissor" };
        String playAgain = "Y";
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("Enter(rock paper scissor):   ");
            String playerChoice  = sc.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("Its tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {

                System.out.println("You win!");
            }
            else{
                System.out.println("You loose! Try again ");
            }
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.nextLine().trim();
        }while(playAgain.equals("y"));

        System.out.println("Thanks for playing");


    }
}
