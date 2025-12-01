import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class switch_cases {

    public static  void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.println("Enter day: ");
        day = scanner.nextLine();

        switch(day){
            /*

            case "Monday" -> System.out.println("Its a weekday ");
            case "Tuesday" -> System.out.println("Its a weekday ");
            case "Wednesday" -> System.out.println("Its a weekday ");
            case "Thursday" -> System.out.println("Its a weekday ");
            case "Friday" -> System.out.println("Its a weekday ");
            case "Saturday" -> System.out.println("Its a weekend! ");
            case "Sunday" -> System.out.println("Its a weekend! ");

            default -> System.out.println(day+" Invalid day!");
        }

             */


            case "monday","tuesday","wednesday","thursday","friday" ->
                    System.out.println("Its a weekday ");
            case "saturday","sunday"->
                    System.out.println("Its a weekend!");

            default -> System.out.println("Invalid day!");
        }

    }

}
