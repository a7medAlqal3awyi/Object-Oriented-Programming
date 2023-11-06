package inheritance;
//is a relationship
// boy is a person
// Girl is a person
public class Main {
    public static void main(String[] args) {
        Girl g = new Girl();
        g.setName("Doaa");
        System.out.println(g.getName());
        String hh = g.sayHello();
        System.out.println(hh);


        Boy b = new Boy();
        b.setAge(22);
        b.setHasMilitaryService(true);
        System.out.println(b.getAge());
        System.out.println(b.isHasMilitaryService());
        b.eat();
    }
}
