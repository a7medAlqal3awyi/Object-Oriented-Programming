package projcets.interfase;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat walking");

    }
}
