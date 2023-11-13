package projcets.contra;

public class Main {
    public static void main(String[] args) {

        // this will call first constructor (5) the second constructor (6)
        Product p1 = new Product("Camera", "High Resolution", 50.5f, 8, .8f, "Red");

        // copy constructor

        Product p2 = new Product(p1);
        System.out.println(p2.toString());
    }
}
