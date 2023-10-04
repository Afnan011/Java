package Exam2;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends Frame implements KeyListener {

    Label label;

    public SwingDemo()
    {
        addKeyListener(this);
        label = new Label();
        label.setBounds(100, 100, 200, 40);
        add(label);
        setSize(400, 400);
        setLayout(null);
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



