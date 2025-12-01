import java.util.ArrayList;
import java.util.Scanner;


public class Student_grade {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> students = new ArrayList<>();
    public static void main(String[] args) {

        boolean isRunning = true;


        while (isRunning) {

            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1 -> Student();
                case 2 ->viewStudent();
                case 3 ->searchStudent();
                case 4 -> {
                    System.out.println("Exiting...");
                 isRunning = false;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }

        }

    }
    static void Student(){
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            String grade;

            if (marks >= 70) {
                grade = "A";
            } else if (marks >= 50) {
                grade = "B";
            } else {
                grade = "Fail";
            }

            System.out.println("Grade is: " + grade);

            students.add("| Name: " + name + " | Marks: " + marks + " | Grade: " + grade + " |");
        }

    static void viewStudent() {
        if(students.isEmpty()){
            System.out.println("No student");
            return;
        }
        System.out.println("\nList of Students:");
        for (String s : students) {
            System.out.println("- " + s);
        }

    }
    
    static void searchStudent(){

        System.out.println("Enter name of the student: ");
        String name = sc.nextLine();
        boolean found = false;

        for (String s : students ){
            if (s.toLowerCase().contains(name.toLowerCase())){
                System.out.println("Student found " + name);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Error! Not found");
        }
    }

}
