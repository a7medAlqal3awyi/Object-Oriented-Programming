package interface1;
/*
                                           ==> final --> cant change
 * Attributes in Interface by default is  ==> public  & must be  initialized take value
                                           ==> static --> can call without create object
 * Methods in Interface must be abstract
 * can not instantiate object like : Animal a  =new Animal();  XXX
 * the subclass which implements the interface  must implement all methods
 * any class can implement multiple interfaces
* */
public class Main {
    public static void main(String[] args){
        Cat cat =new Cat();
        cat.animalSound();
        cat.animalType();
        System.out.println("================");

        Dog dog =new Dog();
        dog.animalSound();
        dog.animalType();
        dog.walk();
        dog.eat();

    }
}
