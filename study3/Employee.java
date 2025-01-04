package s250105.study3;

public class Employee {
    private String name;
    private int age;

    public Employee() {

    }

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work() {
        System.out.println("工作");
    }
}
