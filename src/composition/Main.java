package composition;
 // Composition ===> Has a Relationship
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("BMW");
        System.out.println(c.getName());
        Engine engine = new Engine();
        engine.setPower(200);
        engine.setType("NA");
        c.setEngine(engine);
        System.out.println(c.getEngine().getPower());
        System.out.println(c.getEngine().getType());

        Engine engine2 = new Engine();
        engine2.setPower(500);
        Car c2 = new Car(
                "REd", "BMW", "X6", engine2
        );
        System.out.println(c2.getEngine().getPower());

    }
}
