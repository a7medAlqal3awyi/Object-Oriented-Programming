package composition;

public class Car {
    private  String color;
    private  String name;
    private  String model;
    private  Engine engine  ;


    public Car(String color, String name, String model, Engine engine) {
        this.color = color;
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public Car(String color, String name, String model) {
        this.color = color;
        this.name = name;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
