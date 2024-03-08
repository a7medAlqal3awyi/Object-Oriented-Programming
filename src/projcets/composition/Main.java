package projcets.composition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("180","1800");
        Car c1 = new Car("BMW", "Cross", 300, engine);
        System.out.println(engine.getPower());
    }
}

