package Exam2;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<APPLET CODE ="AppletDemo.class" WIDTH=300 HEIGHT=200></APPLET>
*/

public class AppletDemo extends Applet implements KeyListener {

    TextField txtRes;
    String msg = "";

    public void init()
    {
        txtRes = new TextField(15);
        add(txtRes);
        txtRes.addKeyListener(this);
    }


    public void keyPressed(KeyEvent e)
    {
        txtRes.setText("Key Pressed");
        showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent e)
    {
        txtRes.setText("Key Released");
        showStatus("Key Released");
    }

    public void keyTyped(KeyEvent e)
    {
        msg += e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 20);
    }


}
