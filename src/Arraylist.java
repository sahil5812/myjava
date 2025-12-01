import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //                     Arrays are fixed in size, but ArrayLists can change

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Coconut");
//
//        //fruits.remove(0);
//        //fruits.set(0, "Pineapple");
//
//        Collections.sort(fruits);
//
//        for(String fruit : fruits){
//            System.out.println(fruit);

        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter how the # food you would: ");
        int num_of_foods = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i <=  num_of_foods;i++){
            System.out.println("Enter food %d " + i + " ");
            String food= sc.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

    }
}
