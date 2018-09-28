package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class moveOrders extends JPanel implements ActionListener {
   protected static JButton Submit;
   protected static JButton Map;
   protected static JButton Example;
   static JFrame frame = new JFrame("Turkey");
   static JTextField textField1 = new JTextField("",15);
   static JTextField textField2 = new JTextField("",15);
   static JTextField textField3 = new JTextField("",15);
   public static String text1;
   public static String text2;
   public static String text3;
   
   public moveOrders() {      
      Example = new JButton("How to move");
      Example.setVerticalTextPosition(AbstractButton.BOTTOM);
      Example.setHorizontalTextPosition(AbstractButton.CENTER);
      Example.setActionCommand("Example");
      Example.addActionListener(this);
      
      add(Example);
      
      Submit = new JButton("Submit");
      Submit.setVerticalTextPosition(AbstractButton.BOTTOM);
      Submit.setHorizontalTextPosition(AbstractButton.CENTER);
      Submit.setActionCommand("close");
      Submit.addActionListener(this);
      
      add(Submit);
      
      Map = new JButton("Look at map");
      Map.setVerticalTextPosition(AbstractButton.BOTTOM);
      Map.setHorizontalTextPosition(AbstractButton.CENTER);
      Map.setActionCommand("map");
      Map.addActionListener(this);
      
      add(Map);
   }
   
   public static void createAndShowGUI() {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setPreferredSize(new Dimension(1500, 1000));
      
      Container contentPane = frame.getContentPane();
      SpringLayout layout = new SpringLayout();
      contentPane.setLayout(layout);
    
      JLabel label1 = new JLabel("Order for troops: ");
      JLabel label2 = new JLabel("Order for troops: ");
      JLabel label3 = new JLabel("Order for troops: ");
      
      moveOrders newContentPane = new moveOrders();
      newContentPane.setOpaque(true);
      newContentPane.setLayout(layout);
      contentPane.add(newContentPane);
      
      contentPane.add(label1);
      contentPane.add(label2);
      contentPane.add(label3);
      contentPane.add(textField1);
      contentPane.add(textField2);
      contentPane.add(textField3);
      contentPane.add(Example);
      contentPane.add(Submit);
      contentPane.add(Map);
      
      layout.putConstraint(SpringLayout.WEST, label1, 5, SpringLayout.WEST, contentPane);
      layout.putConstraint(SpringLayout.NORTH, label1, 5, SpringLayout.NORTH, contentPane);
      layout.putConstraint(SpringLayout.WEST, label2, 5, SpringLayout.WEST, contentPane);
      layout.putConstraint(SpringLayout.NORTH, label2, 25, SpringLayout.NORTH, label1);
      layout.putConstraint(SpringLayout.WEST, label3, 5, SpringLayout.WEST, contentPane);
      layout.putConstraint(SpringLayout.NORTH, label3, 25, SpringLayout.NORTH, label2);
      layout.putConstraint(SpringLayout.WEST, textField1, 5, SpringLayout.EAST, label1);
      layout.putConstraint(SpringLayout.NORTH, textField1, 5, SpringLayout.NORTH, contentPane);
      layout.putConstraint(SpringLayout.WEST, textField2, 5, SpringLayout.EAST, label2);
      layout.putConstraint(SpringLayout.NORTH, textField2, 25, SpringLayout.NORTH, textField1);
      layout.putConstraint(SpringLayout.WEST, textField3, 5, SpringLayout.EAST, label3);
      layout.putConstraint(SpringLayout.NORTH, textField3, 25, SpringLayout.NORTH, textField2);
      layout.putConstraint(SpringLayout.NORTH, Submit, 25, SpringLayout.NORTH, label3);
      layout.putConstraint(SpringLayout.WEST, Submit, 5, SpringLayout.WEST, newContentPane);
      layout.putConstraint(SpringLayout.NORTH, Map, 25, SpringLayout.NORTH, label3);
      layout.putConstraint(SpringLayout.WEST, Map, 5, SpringLayout.EAST, Submit);
      layout.putConstraint(SpringLayout.NORTH, Example, 25, SpringLayout.NORTH, label3);
      layout.putConstraint(SpringLayout.WEST, Example, 5, SpringLayout.EAST, Map);
      
      frame.pack();
      frame.setVisible(true);
      
      while(text1 == null) {
         try {
            Thread.sleep(1);
         } catch (Exception e) {
         }
      }
   }
   
   public void actionPerformed(ActionEvent e) {
      if ("close".equals(e.getActionCommand())) {
         text1 = textField1.getText();
         text2 = textField2.getText();
         text3 = textField3.getText();
         frame.dispose();
      }
      if ("map".equals(e.getActionCommand())) {
         nestedFrame.createAndShowGUI();
      }
      if ("Example".equals(e.getActionCommand())) {
         explainFrame.createAndShowGUI();
      }
   }
   
   public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI();
         }
      });
   }
}
