import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class RC_View extends JFrame
{
    private JButton button = new JButton("Rocks yo");
    
    public void addButtonActionListener(ActionListener listener)
    {
        button.addActionListener(listener);
    }
    
    public RC_View() {
        //Add the view for stuff related here
    }
}
