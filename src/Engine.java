public class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }
    void Start() {
        System.out.println("You start the " + this.type + " engine");
    }
}
