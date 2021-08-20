import java.awt.*;  
import java.awt.event.*;  
public class LabelExample extends Frame implements ActionListener{  
    TextField tf; Label lb; Button b;  
    LabelExample(){  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        lb=new Label();  
        lb.setBounds(50,100, 250,20);      
        b=new Button("Find IP");  
        b.setBounds(50,150,60,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(lb);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }
  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String address=tf.getText();  
        String ip=java.net.InetAddress.getByName(address).getHostAddress();  
        lb.setText("IP address is "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });
  
    }  
    public static void main(String[] args) {  
        new LabelExample();  
    }  
}  