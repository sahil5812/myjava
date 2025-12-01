import java.util.Scanner;

public class substring {
    public static void main (String[] args) {

//        String email = "Sahil34@gmail.com";
//        String username = email.substring(0,7);
//        String domain = email.substring(8,17);
//        System.out.println(username);
//        System.out.println(domain);
        // its not flexible

        Scanner scanner = new Scanner(System.in);


        String email ;
        System.out.println("Enter email");
        email = scanner.nextLine();

        if (email.contains("@gmail.com")){


            String username = ("Your user name is "+ email.substring(0,email.indexOf("@")));
            String domain = ("Your domain is "+email.substring(email.indexOf("@")+1));
            System.out.println(username);
            System.out.println(domain);

        }else {
            System.out.println("Email must contain @gmail.com");
        }

    }
}
