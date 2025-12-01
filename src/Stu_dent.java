public class Stu_dent extends Person{
    double gpa;

    Stu_dent(String First , String last ,double gpa){
        super(First,last);
        this.gpa =gpa;

    }
    void showGpa(){
        System.out.println(this.First+" "+this.last +"'s gpa is: " + this.gpa );
    }
}
