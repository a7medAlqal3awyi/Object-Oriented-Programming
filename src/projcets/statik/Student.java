package projcets.statik;

public class Student {
    String name;
    static String department = "CS";
    static int count = 1;
    int id;

    public Student(String name ) {
        this.name = name;
        this.id = count;
        count++;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
