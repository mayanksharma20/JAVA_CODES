import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet{
    int x,y;
    public void init(){
        x=10;
        y=45;
        setSize(250,300);
    }
    public void paint(Graphics g){
        g.drawString("hello ji",x,y);
    }
}
