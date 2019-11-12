package GuiJob;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border1841720149Alief extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel Mpanel;

    public Border1841720149Alief() {
        Mpanel = new JPanel();
        Mpanel.setLayout(new BorderLayout());
        
        Mpanel.add(new JButton("1"), BorderLayout.NORTH);
        Mpanel.add(new JButton("2"), BorderLayout.WEST);
        Mpanel.add(new JButton("3"), BorderLayout.CENTER);
        Mpanel.add(new JButton("4"), BorderLayout.EAST);
        Mpanel.add(new JButton("5"), BorderLayout.SOUTH);
    
        add(Mpanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Border Layout Beta Test");
    }
}