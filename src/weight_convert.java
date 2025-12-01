import java.util.Scanner;

public class weight_convert {

 public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);

 double Weight;
 double newWeight;
 int choice;

     System.out.println("1:Convert ibs to kgs");
     System.out.println("2:Convert kgs to ibs");

     System.out.println("Choose above option");
     choice = scanner.nextInt();

     if (choice == 1){

         System.out.println("Enter the weight in ibs:");
         Weight = scanner.nextDouble();
         newWeight=Weight*0.453592;
         System.out.printf("The new weight is : %.2f",newWeight);
     }else if(choice == 2){

         System.out.println("Enter the weight in kgs");
         Weight = scanner.nextDouble();
         newWeight = Weight*2.20462;
         System.out.printf("The new weigth is :%.2f",newWeight);
     }else {
         System.out.println("Invalid choice!");
     }

     scanner.close();
 }

}
