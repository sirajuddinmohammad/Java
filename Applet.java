import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo.class" height=300 width=300 ></applet>*/
public class Applet {
public void init() {
setBackground(Color.red);
}
public void paint(Graphics g){
g.setColor(Color.blue);
g.drawString("svcet",100,100);
}
