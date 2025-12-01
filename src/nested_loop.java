import java.util.Scanner;

public class nested_loop {

    public static void main(String[] args) {

        // nested loop = A loop inside another loop
        //                          Used often with matrices or DS&A
        Scanner scanner = new Scanner(System.in);

        int columns;
        int rows;
        char symbol;

        System.out.println("Enter the no. of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the no. of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the no. of rows: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0;i<rows;i++){

            for (int j = 0;j<columns;j++){

                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
