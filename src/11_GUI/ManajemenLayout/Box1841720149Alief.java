package GuiJob;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box1841720149Alief extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel Mpanel;

    public Box1841720149Alief() {
        Mpanel = new JPanel();
        Mpanel.setLayout(new BoxLayout(Mpanel, BoxLayout.Y_AXIS));
        
        Mpanel.add(new JButton("1"));
        Mpanel.add(new JButton("2"));
        Mpanel.add(new JButton("3"));
        Mpanel.add(new JButton("4"));
        Mpanel.add(new JButton("5"));
    
        add(Mpanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Box Layout Beta Test");
    }
    
    
}