package SwingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileWindow extends JFrame implements ActionListener, Runnable {
    Thread compiler = null;
    Thread run_prom = null;
    boolean bn = true;
    CardLayout mycard;

    File file_saved = null;

    JButton button_input_txt,
            button_compiler_text,
            button_compiler,
            button_run_prom,
            button_see_doswin;

    JPanel p = new JPanel();
    JTextArea input_text = new JTextArea();
    JTextArea compiler_text = new JTextArea();
    JTextArea dos_out_text = new JTextArea();

    JTextField input_file_name_text = new JTextField();
    JTextField run_file_name_text = new JTextField();

    // constructor
    public FileWindow(){
        // TODO Auto-generated constructor stub
        super("Java Language compiler");
        mycard = new CardLayout();
        compiler = new Thread(this);
        run_prom = new Thread(this);
        button_input_txt = new JButton("Enter program (wite)");
        button_compiler_text = new JButton("Compile Result (pink)");
        button_compiler = new JButton("Run program result (lightblue)");
        button_run_prom = new JButton("Compile");
        button_see_doswin = new JButton("Run");

        p.setLayout(mycard);
        p.add("input",input_text);
        p.add("compiler", compiler_text);
        p.add("dos",dos_out_text);
        add(p, "center");


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void run() {

    }
}
