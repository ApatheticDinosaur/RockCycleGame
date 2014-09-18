
public class RC_Controller
{
    private final RC_View view = new RC_View();
    RC_Model model;
    
    public RC_Controller()
    {
        
    }
    
    public static void main(String[] args) { 
        RC_Controller app = new RC_Controller(); 
        app.view.setVisible(true); // make visual component appear
    }
}
