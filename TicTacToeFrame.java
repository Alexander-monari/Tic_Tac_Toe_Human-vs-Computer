/**Program makes a ticTacToe game
  * @author Alex Monari
  * @date 3/19/18
  */
import static java.lang.System.out;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.field.*;
import java.awt.field.ActionEvent;
import java.awt.field.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TicTacToeFrame extends JFrame implements ActionListener{
  
  private JTextField winner;
  private JTextField x00;
  private JTextField x01;
  private JTextField x02;
  private JTextField x10;
  private JTextField x11;
  private JTextField x12;
  private JTextField x20;
  private JTextField x21;
  private JTextField x22;
  public static String[][] matrix = new String[3][3];
  private JButton playButton;
  private JButton clearButton;
  
  public TicTacToeFrame(){
    
    GridBagConstraints spot = null;
    setSize(1000,1000);
    setTitle(" Tic Tac Toe ");
    //initialize matrix to a different number for each array value
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; i++)
        matrix[i][j] = Integer.toString(((j + 1)*(i + 1)));
    }
    
    playButton = new JButton("Play");
    playButton.addActionListener(this);
    
    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    
    setLayout(new GridBagLayout());
    spot = new GridBagConstraints();
    
    spot.insets = new Insets(10, 10, 10, 10);
    
    x00 = new JTextField(2);
    x00.setEditable(true);
    x00.setText("  ");
    
    x01 = new JTextField(2);
    x01.setEditable(true);
    x01.setText("  ");
    
    x02 = new JTextField(2);
    x02.setEditable(true);
    x02.setText("  ");
    
    x10 = new JTextField(2);
    x10.setEditable(true);
    x10.setText("  ");
    
    x11 = new JTextField(2);
    x11.setEditable(true);
    x11.setText("  ");
    
    x12 = new JTextField(2);
    x12.setEditable(true);
    x12.setText("  ");
    
    x20 = new JTextField(2);
    x20.setEditable(true);
    x20.setText("  ");
    
    x21 = new JTextField(2);
    x21.setEditable(true);
    x21.setText("  ");
    
    x22 = new JTextField(2);
    x22.setEditable(true);
    x22.setText("  ");
    
    winner = new JTextField(3);
    winner.setEditable(false);
    winner.setText("  ");
    
    spot.gridx = 0;
    spot.gridy = 0;
    add(x00, spot);
    
    spot.gridx = 0;
    spot.gridy = 1;
    add(x01, spot);
    
    spot.gridx = 0;
    spot.gridy = 2;
    add(x02, spot);
    
    spot.gridx = 1;
    spot.gridy = 0;
    add(x10, spot);
    
    spot.gridx = 1;
    spot.gridy = 1;
    add(x11, spot);
    
    spot.gridx = 1;
    spot.gridy = 2;
    add(x21, spot);
    
    spot.gridx = 2;
    spot.gridy = 0;
    add(x20, spot);
    
    spot.gridx = 2;
    spot.gridy = 1;
    add(x21, spot);
    
    spot.gridx = 2;
    spot.gridy = 2;
    add(x22, spot);
    
    spot.gridx = 0;
    spot.gridy = 3;
    add(playButton, spot);
    
    spot.gridx = 1;
    spot.gridy = 3;
    add(winner, spot);
    
    spot.gridx = 2;
    spot.gridy = 3;
    add(clearButton, spot);
    
    this.pack();
  }
  
  public void actionPerformed (ActionEvent event){
    
    if (field.getSource() == playButton){
      field = x00.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[0][0] = field;
      field = x01.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[0][1] = field;
      field = x02.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[0][2] = field;
      field = x10.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[1][0] = field;
      field = x11.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[1][1] = field;
      field = x12.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[1][2] = field;
      field = x20.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[2][0] = field;
      field = x21.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[2][1] = field;
      field = x22.getText().trim();
      if (field.equals("x")||field.equals("o"))
        matrix[2][2] = field;
      boolean ans = checkTTT(matrix);
      if (ans)
        winner.setText("Winner");
    }
  }
    
  public boolean checkTTT(String [][] matrix){
      
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; i++){
        if (matrix[i][j] == matrix[i][j + 1]) return true;
        else return false;
      }
    }
  }
}
    
        