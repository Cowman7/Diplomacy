package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class explainFrame extends JPanel implements ActionListener {
   protected static JButton exit;
   static JFrame frame2 = new JFrame("How to move");
   
   public explainFrame() {
      exit = new JButton("Close help");
      exit.setVerticalTextPosition(AbstractButton.BOTTOM);
      exit.setHorizontalTextPosition(AbstractButton.CENTER);
      exit.addActionListener(this);
      
      add(exit);
   }
   
   public static void createAndShowGUI() {
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setPreferredSize(new Dimension(1500, 1000));
      
      Container contentPane1 = frame2.getContentPane();
      SpringLayout layout1 = new SpringLayout();
      contentPane1.setLayout(layout1);
      
      explainFrame pane2 = new explainFrame();
      pane2.setOpaque(true);
      pane2.setLayout(layout1);
      contentPane1.add(pane2);
      
      
      JLabel HoldHeading = new JLabel("Hold");
      //HoldHeading.setFont(new Font("Serif", Font.BOLD,50));
      JLabel Hold = new JLabel("<html>This is the default for all units (what they will do if not given any other orders). The unit will stay in its position, and will not move, support, convoy, or do anything. <br>Holding");// units can be supported by units in neighboring provinces or be attacked by foreign units. If the attacking unit has more units supporting it than the holding unit, the <br>holding unit is ousted from that province and must either retreat or disband. <br>A hold order is written as follows: Army/Fleet (Province that the unit is in) holds. <br>Example: Italy: Army Rome holds.</html>");
      //Hold.setFont(new Font("Helvetica", Font.PLAIN, 20));
      JLabel MoveHeading = new JLabel("Move");
      //MoveHeading.setFont(new Font("Serif",Font.BOLD,50));
      JLabel Move = new JLabel();//"<html>This order moves the unit in one province to an adjacent province. Of course, armies cannot move into the sea, and fleets cannot move into provinces without a coast.<br> A unit may not move into a province held by another unit unless it has support. <br>The attacking unit must have more support than the defending unit for the attack to be successful. If the attack is not successful, the attacking unit does not move. <br>A move order is written as follows: Army/Fleet (Province that the unit is in) to (destination province). <br>Example: Italy: Fleet Naples to Ionian Sea</html>");
      //Move.setFont(new Font("Helvetica", Font.PLAIN, 20));
      JLabel SupportHeading = new JLabel("Support");
      //SupportHeading.setFont(new Font("Serif", Font.BOLD,50));
      JLabel Support = new JLabel();//"<html>Support is the trickiest aspect of the rules, and the most important of the game. <br>Support may involve cooperation between two (or more) powers. Simply put, more support defeats less support. <br>The support order is given in reference to another unit's move. That other unit's move must be to a province into which the supporting unit could otherwise move. <br>Support may also be given to a unit holding its position. In addition, units giving support can themselves be supported in their holding position. <br>Support is a unit's sole action for a given move, and supporting units remain where they are (unless they are attacked by greater support). <br><strong>Cutting Support:</strong> If the supporting unit is attacked during the turn by some other unit, its support is cut. <br>In effect, the support order becomes a hold order, as the unit must defend its province against the attack. <br>Support orders are written thus: Army/Fleet (Space that the supporting unit is in) supports Army/Fleet (Space that the supported unit is holding). <br>Example: Italy: Army Piedmont supports Army Venice</html>");
      //Support.setFont(new Font("Helvetica", Font.PLAIN, 20));
      
      contentPane1.add(exit);
      contentPane1.add(Support);
      contentPane1.add(Hold);
      contentPane1.add(Move);
      contentPane1.add(HoldHeading);
      contentPane1.add(MoveHeading);
      contentPane1.add(SupportHeading);
      
      layout1.putConstraint(SpringLayout.NORTH, HoldHeading, 0, SpringLayout.NORTH, contentPane1);
      layout1.putConstraint(SpringLayout.WEST, HoldHeading, 5, SpringLayout.WEST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, exit, 5, SpringLayout.NORTH, contentPane1);
      layout1.putConstraint(SpringLayout.EAST, exit, -5, SpringLayout.EAST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, Hold, 0, SpringLayout.SOUTH, HoldHeading);
      layout1.putConstraint(SpringLayout.WEST, Hold, 5, SpringLayout.WEST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, MoveHeading, 0, SpringLayout.SOUTH, Hold);
      layout1.putConstraint(SpringLayout.WEST, MoveHeading, 5, SpringLayout.WEST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, Move, 0, SpringLayout.SOUTH, MoveHeading);
      layout1.putConstraint(SpringLayout.WEST, Move, 5, SpringLayout.WEST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, SupportHeading, 0, SpringLayout.SOUTH, Move);
      layout1.putConstraint(SpringLayout.WEST, SupportHeading, 5, SpringLayout.WEST, contentPane1);
      layout1.putConstraint(SpringLayout.NORTH, Support, 0, SpringLayout.SOUTH, SupportHeading);
      layout1.putConstraint(SpringLayout.WEST, Support, 5, SpringLayout.WEST, contentPane1);
      
      frame2.setUndecorated(true);
      frame2.pack();
      frame2.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e) {
      frame2.dispose();
   }
   
   public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI();
         }
      });
   }
}