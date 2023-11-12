package abstraction;

public class Square extends  Shape{
    @Override
    void draw() {
        System.out.println("shape draw ");
    }

    @Override
    void computeArea() {
        System.out.println(width*height);
    }

    @Override
    void computeParameter() {
        System.out.println(2*(width+height));
    }
}
