
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends Single{
    Joystick j;
    Graphics a;
    Manager m;
    JLabel label;
    int x,y;
    
    public Avion(Manager m) {
        super(m);
    }

    public Avion(Graphics a, JLabel label, Manager m) {
        super(m);
        this.a = a;
        this.label = label;
    }

    

    public void setLabel(JLabel label) {
        // Para ponrle un avioncito a un label ;)
        label.setIcon(new ImageIcon(getClass().getResource("av1.png")));
        this.label = label;
        
    }
    
    public void setMovimiento( Joystick j){
        y=j.getPOV();
        x=j.getButtons();
        
    }
    
    public void enemigo(){
        
    }
    
    public void disparo(KeyEvent e){
        a.setColor(Color.red);
        int aux=y;
        if(e.VK_Q==e.getKeyCode()){
            for(int i=0; i<1000; i++){
                a.fillOval(x, aux, 5, 5);
                aux+=10;
                
                
            }
        }
    }
    
}
