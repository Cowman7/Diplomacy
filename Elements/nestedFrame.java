package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class nestedFrame extends JPanel implements ActionListener {
   protected JButton Close;
   static JFrame frame1 = new JFrame("Map");
   
   public nestedFrame() {
      ImageIcon map = createImageIcon("map.jpg");
      
      JLabel label = new JLabel(map);
      
      add(label);
      
      
      Close = new JButton("Close map");
      Close.setVerticalTextPosition(AbstractButton.BOTTOM);
      Close.setHorizontalTextPosition(AbstractButton.CENTER);
      Close.addActionListener(this);
      
      add(Close);
   }
   
   public static void createAndShowGUI() {
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame1.add(new nestedFrame());
      frame1.setUndecorated(true);
      
      frame1.pack();
      frame1.setVisible(true);
   }
   
   protected static ImageIcon createImageIcon(String path) {
      java.net.URL imgURL = nestedFrame.class.getResource(path);
      if (imgURL != null) {
         return new ImageIcon(imgURL);
      } else {
         System.err.println("Couldn't find file: " + path);
         return null;
      }
   }
    
   public void actionPerformed(ActionEvent e) {
      frame1.dispose();
   }
   
   public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI();
         }
      });
   }
}
