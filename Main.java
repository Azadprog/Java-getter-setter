import java.util.Scanner;
import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel; 

public class Main {
  public static void main(String[] args) {


  System.out.println("Hello"); 
   Scanner sc = new Scanner(System.in);
    
    Person p1 = new Person(); 
    System.out.println("Age:");
    p1.setAge(sc.nextInt());
    

    System.out.println("Reg:");
    p1.setReg(sc.nextInt());

    System.out.println("Name:");
    p1.setName(sc.next());


    System.out.println(p1.getAge() +" " + p1.getReg()+" "  + p1.getName());

    
  JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
	JButton button2 = new JButton();
      panel.add(label);  
        panel.add(button);
	 frame.add(panel);  
        frame.setSize(200, 200);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true); 
  }
  
}
