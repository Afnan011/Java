package Practice.lab8;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<APPLET CODE="AppletDemo.class" Width=400 height=400> </APPLET>
 */

public class AppletDemo extends Applet implements KeyListener
{

    String msg = "";
    TextField txt;

    public void init()
    {
        txt = new TextField();
        add(txt);
        txt.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {
        txt.setText("Key Pressed");
        showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent e)
    {
        txt.setText("Key Released");
        showStatus("Key Released");
    }

    public void keyTyped(KeyEvent e)
    {
        msg += e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 100, 100);
    }

}
