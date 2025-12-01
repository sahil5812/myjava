import java.util.Scanner;

public class USER_INPUT_ARRAY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        String[] foods;
        System.out.println("How many food?: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for (int i = 0 ; i <foods.length; i++){
            System.out.println("Enter food: ");
            foods[i]= sc.nextLine();
        }
        for (String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
