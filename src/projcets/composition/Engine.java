package projcets.composition;

public class Engine {
    private  String power;
    private  String capacity;

    public Engine() {
    }

    public Engine(String power, String capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
