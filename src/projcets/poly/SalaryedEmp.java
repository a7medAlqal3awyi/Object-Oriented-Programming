package projcets.poly;

public class SalaryedEmp extends Employee {
    private float bouns;

    public SalaryedEmp(String name, String email, String address, float salary, float bouns) {
        super(name, email, address, salary);
        this.bouns = bouns;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
    @Override
    public float getSalary() {
        return super.getSalary()+bouns;
    }

}
