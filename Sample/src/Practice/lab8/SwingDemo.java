package Practice.lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo extends JFrame implements  KeyListener
{

    JLabel label;

    public SwingDemo()
    {
        addKeyListener(this);

        label = new JLabel();
        label.setBounds(100, 100, 200, 100 );
        add(label);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }


    public void keyPressed(KeyEvent e)
    {
        char ch = e.getKeyChar();

        if(ch == 'm' || ch == 'M')
        {
            label.setText("Good Morning");
        }

        else if(ch == 'a' || ch == 'A')
        {
            label.setText("Good Afternoon");
        }

        else if(ch == 'e' || ch == 'E')
        {
            label.setText("Good Evening");
        }

        else if(ch == 'n' || ch == 'N')
        {
            label.setText("Good Night");
        }

        else{
            label.setText(ch + ": Key is not defined");
        }
    }

    public void keyReleased(KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }


    public static void main(String[] args) {
        new SwingDemo();
    }
}
