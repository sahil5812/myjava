public class Person {
    String First;
    String last;

    Person(String First, String last){
        this.First = First;
        this.last = last;


    }

    void showName (){
        System.out.println(this.First+" "+ this.last);
    }

}
