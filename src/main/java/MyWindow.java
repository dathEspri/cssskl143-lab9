import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements MouseListener{
    public MyWindow(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this);
    }
    public static void main(String[] args){
        MyWindow window = new MyWindow();
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse entered component");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse exited component");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse released");
    }
}
