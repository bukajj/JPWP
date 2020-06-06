package snake;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton STARTButton;
    private JButton CLOSEButton;
    private static final int WIDTH = 200, HEIGHT = 200;


    public Menu(){
        JFrame menu = new JFrame("MENU");
        menu.setUndecorated(true);
        menu.setFocusable(true);
        menu.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        menu.setResizable(false);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(0, 1, 0, 0));

        STARTButton = new JButton("START");
        STARTButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame game = new JFrame();
                Screen screen = new Screen(WIDTH, HEIGHT);
                game.add(screen);
                game.setUndecorated(true);
                game.setResizable(false);
                game.pack();
                game.setLocationRelativeTo(null);
                game.setVisible(true);
            }
        });

        CLOSEButton = new JButton("CLOSE");
        CLOSEButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Menu();
    }
}
