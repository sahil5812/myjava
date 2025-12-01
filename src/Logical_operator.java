import java.util.Scanner;

public class Logical_operator {

    public static void main(String[] args) {

        // && = AND
        // || = OR
        // !  = NOT


//        double temp = 35;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD 😀");
//            System.out.println("It is SUNNY outside ☀");
//        }
//        else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is GOOD 😀");
//            System.out.println("It is CLOUDY outside ☁");
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("The weather is BAD 😩");
//        }



        Scanner scanner = new Scanner(System.in);
         String username;

        System.out.println("Enter username:");
        username = scanner.nextLine();

         if (username.length()<4 || username.length()>12){

             System.out.println("username must be between 4-12 charcater");
         } else if (username.contains(" ") || username.contains("_")) {

             System.out.println("username must not contain underscore or space!");
         }else {

             System.out.println("welcome "+ username );
         }
             
         }
    }
