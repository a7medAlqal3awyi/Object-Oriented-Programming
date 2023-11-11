package interface1;

public class Dog implements Animal  ,Pets {
    @Override
    public void animalSound() {
        System.out.println("HooooHoo");
    }

    @Override
    public void animalType() {
        System.out.println("Dog Type is Pet ");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void walk() {
        System.out.println("Dog walk");
    }
}
