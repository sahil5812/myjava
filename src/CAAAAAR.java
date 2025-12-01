public class CAAAAAR {

    String model;
    int year;
    Engine engine;
    CAAAAAR(String model ,int year,String engineType){

        this.model =model;
        this.year =year;
        this.engine =new Engine(engineType);
    }
    void start() {
        this.engine.Start();
        System.out.println("The " + this.model + " is running");
    }
}
