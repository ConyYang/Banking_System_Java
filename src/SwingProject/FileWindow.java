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

        compiler_text.setBackground(Color.pink);
        dos_out_text.setBackground(Color.cyan);

        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(3,3));
        p1.add(button_input_txt);
        p1.add(button_compiler_text);
        p1.add(button_see_doswin);

        p1.add(new JLabel("Enter file name .java: "));
        p1.add(input_file_name_text);
        p1.add(button_compiler);
        p1.add(new JLabel("Enter class name of program"));
        p1.add(run_file_name_text);
        p1.add(button_run_prom);

        add(p1, "North");
        button_input_txt.addActionListener(this);
        button_compiler.addActionListener(this);
        button_compiler_text.addActionListener(this);
        button_run_prom.addActionListener(this);
        button_see_doswin.addActionListener(this);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void run() {

    }
}
