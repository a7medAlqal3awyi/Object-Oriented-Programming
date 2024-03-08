package projcets.poly;

public class HourlyEmloyee extends  Employee{
    private  int hoursRate;
    private float hourPrice;

    public HourlyEmloyee(String name, String email, String address, float salary, int hoursRate, float hourPrice) {
        super(name, email, address, salary);
        this.hoursRate = hoursRate;
        this.hourPrice = hourPrice;
    }

    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }

    public float getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }
    public float getSalary() {
        return super.getSalary() + (hourPrice*hoursRate);
    }

}
