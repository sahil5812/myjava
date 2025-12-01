import java.util.Scanner;

public class runtime_polymorphism {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;
        Janwar janwar;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        choice = sc.nextInt();

        if(choice == 1){
            janwar = new kutta();
            janwar.speak();
        } else if (choice == 2 ) {
            janwar = new Billi();
            janwar.speak();
        }
    }

}
