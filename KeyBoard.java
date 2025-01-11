package s250109.study2;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("KeyBoard open");
    }

    @Override
    public void close() {
        System.out.println("KeyBoard close");
    }

    public void input() {
        System.out.println("input ");
    }
}
