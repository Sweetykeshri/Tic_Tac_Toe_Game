import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{

       JTextField jTextFieldFirst,jTextFieldSecond;
       JLabel jLabelFirst,jLabelSecond;
       JButton jButtonStart;
       String firstPlayer="", secondPlayer="";


      Login()
      {
           
          setSize(500, 500);
          setLayout(null);
          setTitle("Create by Sweety Keshri");
          getContentPane().setBackground(Color.cyan);

         


          jLabelFirst = new JLabel("Enter first player name : ");
          jLabelFirst.setBounds(40, 80, 200, 30);
          add(jLabelFirst);

          jTextFieldFirst = new JTextField();
          jTextFieldFirst.setBounds(200, 80,200, 30);
          
          add(jTextFieldFirst);


          jLabelSecond = new JLabel("Enter second player name : ");
          jLabelSecond.setBounds(40, 140, 200, 30);
          add(jLabelSecond);

          jTextFieldSecond = new JTextField();
          jTextFieldSecond.setBounds(200, 140,200, 30);
         
          add(jTextFieldSecond);

          jButtonStart= new JButton("Start Game");
          jButtonStart.setBounds(190, 220, 120, 30);
          add(jButtonStart);
         
           jButtonStart.addActionListener(this);
           setLocationRelativeTo(null); 
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setResizable(false);
          setVisible(true);

          
      }
      @Override
      public void actionPerformed( ActionEvent e){
        if (e.getActionCommand()=="Start Game") {
            firstPlayer = jTextFieldFirst.getText();
            secondPlayer = jTextFieldSecond.getText();
            if( firstPlayer.trim().length()==0||secondPlayer.trim().length()==0)
           {
            JOptionPane.showMessageDialog(null, "Please Enter the Players Name!!");
            return;
           }
           new TicTacToe(firstPlayer, secondPlayer);
        }
      }
      /**
       * @param args
       */
      public static void main(String [] args)
      {
            new Login();
            

      }
}
