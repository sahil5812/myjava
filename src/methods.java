public class methods {

    public static void main (String[] args) throws InterruptedException{


        int age = 8;
        if (agecheck(age)){
            System.out.println("you can sign up");
        }else {
            System.out.println("you need to be 18+");
        }
    }
    static boolean agecheck(int age){

        if (age>=18){
            return true;
        }else {
            return false;
        }

    }

}
