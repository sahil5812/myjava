public class polymorphism {

    public void main(String[] args){

        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.
        //                               Objects can be treated as objects of a common superclass.

        Boat boat = new Boat();
        Bike bike =  new Bike();
        Thaar thaar = new Thaar();

        Vehicle[] vehicles ={boat , bike , thaar};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }

}
