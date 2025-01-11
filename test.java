package s250109.study2;

public class test {
    public static void main(String[] args) {
        NoteBook notebook = new NoteBook();
        notebook.start();
        notebook.stop();
        System.out.println("****************");

        Mouse mouse = new Mouse();
        notebook.useUSB(mouse);
        System.out.println("****************");

        KeyBoard keyboard = new KeyBoard();
        notebook.useUSB(keyboard);
    }
}
