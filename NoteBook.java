package s250109.study2;

public class NoteBook {
    public void start() {
        System.out.println("NoteBook on");
    }

    public void useUSB(USB usb) {
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            usb.open();
            usb.close();
            mouse.click();

        } else {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.open();
            keyboard.close();
            keyboard.input();
        }
    }

    public void stop() {
        System.out.println("NoteBook off");
    }
}
