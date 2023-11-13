package projcets.class_and_obj;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(8888,"Ahmed",5000);
        a1.deposit(4000);
        a1.withdraw(1000);
        System.out.println(a1.toString());
    }
}
