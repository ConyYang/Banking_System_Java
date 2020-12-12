package SwingProject;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main (String[] args){
        FileWindow window = new FileWindow();
        window.pack();
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        window.setBounds(300, 180, 550, 300);
        window.setVisible(true);
    }
}
