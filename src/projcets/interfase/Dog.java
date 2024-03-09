package projcets.interfase;

public class Dog implements Animal {

    //Class 'Dog' must either be declared abstract or implement abstract method 'eat()' in 'Animal'
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking");

    }

}
