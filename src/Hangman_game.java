import java.util.ArrayList;
import java.util.Scanner;

public class Hangman_game {
    public static void main(String[] args){
        String word = "pizza";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character>wordState = new ArrayList<>();
        int wrong_guess = 0;

        for (int i = 0; i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while(wrong_guess< 6){

            System.out.println(getHangmanArt(wrong_guess));

            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c+" ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess =sc.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("Correct guess!");
                for (int i = 0; i<word.length();i++){
                    if (word.charAt(i) == guess){
                        wordState.set(i,guess);
                    }
                }
                if (!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrong_guess));
                    System.out.println("You win!");
                    System.out.println("The word was: "+word);
                    break;
                }
            }else {
                wrong_guess++;
                System.out.println("Wrong guess!");
            }
        }
        if (wrong_guess > 6){
            System.out.println(getHangmanArt(wrong_guess));
            System.out.println("Game over!");
            System.out.println("The word was: "+ word);
        }

    }

    static String getHangmanArt(int wrongGuesses){

        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
