import java.util.Scanner;

public class compound_interest_calculator {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int principle;
        double rate;
        int timecompounded;
        int years;
        double amount;

        System.out.print("Enter principle: ");
        principle = scanner.nextInt();

        System.out.print("Enter rate: ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter timecompounded: ");
        timecompounded = scanner.nextInt();

        System.out.print("Enter year: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1+rate/timecompounded,timecompounded*years);

        System.out.printf("The amount after %d years is %.2f",years,amount);
        scanner.close();

    }

}
