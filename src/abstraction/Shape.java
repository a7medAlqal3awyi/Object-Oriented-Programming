package abstraction;

public abstract  class Shape {
    int color ;
    int width ;
    int height ;
    abstract void draw();
    abstract void computeArea();
    abstract void computeParameter();
    void name(){
        System.out.println("name");
    }


}

