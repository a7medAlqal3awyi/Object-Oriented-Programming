package projcets.interfase;

public interface Animal {
    //Interface attributes are by default public, static and final
    int handNum=5;

//    An interface cannot contain a constructor (as it cannot be used to create objects)
// Animal(){
//
//}



    //Interface abstract methods cannot have body
    void eat();
    void walk();

}
