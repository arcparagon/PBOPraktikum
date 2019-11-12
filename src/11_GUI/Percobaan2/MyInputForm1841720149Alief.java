package GuiJob;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    
public class MyInputForm1841720149Alief extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;

    public MyInputForm1841720149Alief() {
        createTextField1841720149Alief();
        createButton1841720149Alief();
        createPanel1841720149Alief();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    private void createTextField1841720149Alief(){
        aLabel = new JLabel("Score A : ");
        bLabel = new JLabel("Score B : ");
        cLabel = new JLabel("Results : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");      
    }
    
    private void createButton1841720149Alief(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(aField.getText());
                int c = a * b;
                int d = a+b;
                cLabel.setText("Hasil Perkalian : " +c);
                dLabel.setText("Hasil Penjumlahan " +d);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
     
    private void createPanel1841720149Alief(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }
    public static void main(String[] args){
        JFrame frame = new MyInputForm1841720149Alief();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}