package s250105.study4;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void drink() {
        System.err.println("dog drink");
    }
}
