package projcets.inherit;

public class Employee {

    // protected that i can call this attribute across packages level
    protected String name;
    protected String email;
    protected String password;
    protected String department;
    protected int phone;

    public Employee() {
        System.out.println("Parent Constructor");
    }

    public Employee(String name, String email, String password, String department, int phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.department = department;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


}
