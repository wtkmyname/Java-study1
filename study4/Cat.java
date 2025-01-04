package s250105.study4;

/*
 * 继承，要重写抽象类中所有的抽象方法
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void drink() {
        System.out.println("cat drink");
    }
}
