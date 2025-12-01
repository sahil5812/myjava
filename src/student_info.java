public class student_info {

    public static void main(String[] args){
        // constructor = A special method to initialize objects
        //                         You can pass arguments to a constructor
        //                         and set up initial values

        student sc1 = new student("sahil",90,9.2);
        student sc2 = new student("azib",60,8.2);
        student sc3 = new student("saniya",40,5.2);

        System.out.println(sc1.name);
        System.out.println(sc1.age);
        System.out.println(sc1.gpa);
        System.out.println(sc1.isEnrolled);
        System.out.println();

        System.out.println(sc2.name);
        System.out.println(sc2.age);
        System.out.println(sc2.gpa);
        System.out.println(sc2.isEnrolled);
        System.out.println();


        System.out.println(sc3.name);
        System.out.println(sc3.age);
        System.out.println(sc3.gpa);
        System.out.println(sc3.isEnrolled);
        System.out.println();

        sc1.study();
        sc2.study();
        sc3.study();
    }
}
