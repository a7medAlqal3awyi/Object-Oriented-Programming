package projcets.inherit;

public class Developer extends Employee {
    String projectName;

    public Developer() {
        System.out.println("Child Constructor");
    }

    public Developer(String projectName, String name, String email, String password, String department, int phone) {

        //  super(); ==> This will Call No Parameters Constructor and print its content

        super(name, email, password, department, phone);
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "projectName='" + projectName + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", phone=" + phone +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Developer{" +
//                "projectName='" + projectName + '\'' +
//                '}';
//    }
}
