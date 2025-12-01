
import java.util.Random;
import java.util.Scanner;

public class slot_machine {

    public static void main(String[] args) {

        int balance = 100;
        int bet;
        int printRow;
        int payout;
        String playAgain;
        String[] row;

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("  Welcome to slot machine  ");
        System.out.println("Symbol: 🍉 🥖 🥩 🍖");
        System.out.println("****************************");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);

            System.out.println("Enter the amount to bet: ");
            bet = sc.nextInt();
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
            } else if (bet <= 0) {
                System.out.println("Amount should be greater than 0");
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout>0){
                System.out.println("You won! $"+balance);
                balance+=payout;
            }else{
                System.out.println("You lose! Try again");
            }
            System.out.println("You wanna play another round?(Y/N): ");
            sc.nextLine(); // ✅ clear leftover newline
            playAgain = sc.nextLine().toUpperCase();
            if (!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("GAME OVER! Your final balance is $" + balance);

        sc.close();
    }

    static String[] spinRow(){
       Random random = new Random();
       String[] symbol= {"🍉","🥖" ,"🥩" ,"🍖"};
        String[] row = new String[3];
        for (int i = 0; i < 3 ;i++)
            row[i] = symbol[random.nextInt(symbol.length)];
        return row;
    }
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row ,int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            return switch (row[0]){
                case"🍉" -> bet*3;
                case"🥖" -> bet*5;
                case"🥩" -> bet*8;
                case"🍖" -> bet*10;
                default -> 0;
            };
     } else if(row[0].equals(row[1])){
            return switch (row[0]){
            case"🍉" -> bet*13;
            case"🥖" -> bet*3;
            case"🥩" -> bet*6;
            case"🍖" -> bet*154;
            default -> 0;
        };
     }else if(row[1].equals(row[2])){
        return switch (row[1]) {
            case "🍉" -> bet * 11;
            case "🥖" -> bet * 5;
            case "🥩" -> bet * 2;
            case "🍖" -> bet * 4;
            default -> 0;
        };
     }
        return 0 ;
    }
}