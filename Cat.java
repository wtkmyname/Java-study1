package s250109.study1;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    public void catchMouse() {
        System.out.println("cat catch mouse");
    }
}
