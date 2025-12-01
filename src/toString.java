public class toString {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //                       Used to return a string representation of an object.
        //                       By default, it returns a hash code as a unique identifier.
        //                       It can be overridden to provide meaningful details.

        Bus car1 = new Bus("Ford", "Mustang", 2025, "Red");
        Bus car2 = new Bus("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}
