package projcets.class_and_obj;

public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int a, String n, float amt) {
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

    // ايداع
    public void deposit(float amt) {
        this.amount += amt;
        System.out.println(amt + "deposited");
    }

    // سحب
    public void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("there is no balance to withdraw");
        } else {
            this.amount -= amt;
            System.out.println(amt + "wanted to withdraw ");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
