package interface1;

public class Cat implements Animal {
    public void animalSound() {
        System.out.println("Noooo");
    }

    @Override
    public void animalType() {
        System.out.println("Car from pets ");
    }
}
