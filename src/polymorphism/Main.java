package polymorphism;
//  Polymorphism means "many forms"
public class Main {
    public  static void main(String[] args){
        Animal dog;
        dog =new Dog();
        dog.makeSound();


        Animal horse =new Horse();
        horse.makeSound();

    }
}
