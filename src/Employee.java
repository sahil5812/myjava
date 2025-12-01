public class Employee extends Person{
    int salary;

    Employee(String First,String last,int salary){
        super(First,last);
        this.salary = salary;

    }
    void showSalary(){
        System.out.println(this.First +" "+this.last + "'s salary is: $" + this.salary );
    }
}
