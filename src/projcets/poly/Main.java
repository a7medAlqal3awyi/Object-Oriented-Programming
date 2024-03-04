package projcets.poly;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("ahmed", "a@gmail.com", "Eygpt", 1000);
        System.out.println(e1.getSalary());
         e1 = new HourlyEmloyee("ahmed", "a@gmail.com", "Eygpt", 1000, 2, 100);
        System.out.println(e1.getSalary());

         e1 = new SalaryedEmp("ahmed", "a@gmail.com", "Eyg", 1000, 200);
        System.out.println(e1.getSalary());

    }
}
