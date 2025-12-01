
public class Friend {

    static int numOfFriend;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriend++;
    }
    static void display(){
        System.out.println("Your total friends are "+numOfFriend);
    }

}
