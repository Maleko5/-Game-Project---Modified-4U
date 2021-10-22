import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;
import java.awt.Font.*;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
public class GUI implements ActionListener{
  private int count = 0;
  private JLabel temp;
  private JPanel home;
  private JFrame frame;
  public GUI() {
    JButton play = new JButton("Play");
    play.addActionListener(this);

    temp = new JLabel("Clicks: ");
    home = new JPanel();
    home.setBorder(BorderFactory.createEmptyBorder(300, 300, 10, 30));
    home.setLayout(new GridLayout(0, 1));
    home.add(play);
    home.add(temp);

    frame = new JFrame();
    frame.add(home, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Game");
    frame.pack();
    frame.setVisible(true);

  }
  public static void main(String[] args) {
    new GUI();
  }
  public void actionPerformed(ActionEvent e){
    count++;
     temp.setText("Clicks: " + count);
  }
}