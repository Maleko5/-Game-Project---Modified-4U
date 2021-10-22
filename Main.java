import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;
import java.awt.Font.*;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main implements ActionListener{
static JFrame frame;
static JLabel label1;
static JPanel home;
static JPanel playGame;
  public static void main(String[] args) {

    label1 = new JLabel("Want to play Snakes and Ladders?");
    JButton play = new JButton("Play");
    JButton no = new JButton("No");
    no.setBounds(100, 100, 50, 80);
    no.addActionListener(new GUI());
    play.addActionListener(new GUI());

    ImageIcon img = new ImageIcon("SAL.jpg");
    JLabel imglabel = new JLabel(img);
    imglabel.setBounds(80, 90, 256, 256);

    home = new JPanel();
    home.setBorder(BorderFactory.createEmptyBorder(300, 300, 10, 30));
    home.setLayout(new GridLayout(0, 1));
    home.add(play);
    home.add(label1);
    home.add(no);
    home.add(imglabel);
    
    frame = new JFrame();
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(home, BorderLayout.CENTER);
    frame.setTitle("Game");
    frame.pack();
    frame.setVisible(true);

 

}
@Override
public void actionPerformed(ActionEvent ae){
  String button = ae.getActionCommand();

  if (button.equals("Play")){
   System.out.println("OK, Let's go");
   JPanel playGame = new JPanel();
   playGame.setBorder(BorderFactory.createEmptyBorder(300, 300, 10, 30));
   playGame.setLayout(new GridLayout(0, 1));
   
  }
    else {
     System.out.println("OK?");
  }
}
}