package projcets.composition;

public class Car {
    private String name;
    private String type;
    private double speed;

    private Engine engine;


    public Car(String name, String type, double speed, Engine engine) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
