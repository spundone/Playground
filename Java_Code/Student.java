import java.util.*;

public class Student {
    String name, address;
    int age;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not avaliable";
    }

    public void setinfo(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setinfo(int age, String name, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Student [name: " + name + ",\t age: " + age + ",\t address: " + address + "]";
    }

    public static void main(String[] args)
    {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.get(0).setinfo(25, "Raju");
        stu.get(1).setinfo(50, "Ramesh", "Mumbai,India");
        stu.get(3).setinfo(42, "Nagesh", "Hyderabad,India");
        stu.get(5).setinfo(40, "Prash", "Chennai,India");
        stu.get(7).setinfo(69, "Pankaj", "Delhi,India");
        stu.get(8).setinfo(32, "Bhim");
        for (Student s : stu)
        {
            System.out.println(s);
        }
    }
}