package GuiJob;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid1841720149Alief extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel Mpanel;

public Grid1841720149Alief(){
        Mpanel = new JPanel();
        Mpanel.setLayout(new GridLayout(4, 2));
        
        Mpanel.add(new JButton("1"));
        Mpanel.add(new JButton("2"));
        Mpanel.add(new JButton("3"));
        Mpanel.add(new JButton("4"));
        Mpanel.add(new JButton("5"));
    
        add(Mpanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Grid Layout Beta Test");
}
}