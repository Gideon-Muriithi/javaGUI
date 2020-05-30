import javax.swing.JFrame;

public class App {
    public static void main(String args[]) {
        Backend obj = new Backend();

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(350, 500);
        obj.setVisible(true);

    }
}