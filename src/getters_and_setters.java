public class getters_and_setters {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.



        Gaadi gaadi= new Gaadi("Thaar","yellow",1000);
        gaadi.setColor("blue");
        gaadi.setPrice(2000);
        System.out.println(gaadi.getModel()+" "+gaadi.getColor()+" $"+gaadi.getPrice());
    }


}
