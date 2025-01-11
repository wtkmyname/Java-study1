package s250109.study2;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }

    public void click() {
        System.out.println("click the mouse");
    }
}
