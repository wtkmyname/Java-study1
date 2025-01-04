package s250105.study2;

public class Person {
    static int num = 10;

    public Person() {
        System.out.println("Person类中无参构造");
    }

    public Person(int data) {
        this();// 表示调用当前无参构造
        this.num = data;// 表示当前类中num值
        System.out.println("Person类中有参构造");
    }

    public void method1() {
        int num = 20;// 表示当前method1方法中num值

        System.out.println(num);// 表示当前method1方法中num值
        System.out.println(this.num);// 表示当前类中num值

        this.method2();
        System.out.println("Person类中method1方法");
    }

    public static void method2() {
        System.out.println("Person类中method2方法");
    }
}
