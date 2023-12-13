import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;

@SuppressWarnings("deprecation")
public class TicTacToe implements ActionListener, java.awt.event.ActionListener{
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel title=new JPanel();
	JPanel button=new JPanel();
	JLabel textFeild=new JLabel();
	//arrays for button
	JButton[] buttons=new JButton[9];
	boolean player1_turn;
   public TicTacToe() {
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(800,800);
	   frame.getContentPane().setBackground(new Color(10,217,240));
	   frame.setLayout(new BorderLayout());
	   frame.setVisible(true);
	   textFeild.setBackground(new Color(165,210,242));
	   textFeild.setForeground(new Color(13,12,13));
	   textFeild.setFont(new Font("Ink Free",Font.BOLD,75));
	   textFeild.setText("Tic Tac Toe");
	   textFeild.setOpaque(true);
	   button.setLayout(new GridLayout(3,3));
	   button.setBackground(new Color(220,197,237));
	   title.setLayout(new BorderLayout());
	   title.setBounds(0,0,800,100);
	   title.add(textFeild);
	   frame.add(title,BorderLayout.NORTH);
	   frame.add(button);
	   for(int i=0;i<=8;i++) {
		   buttons[i]=new JButton();
		   button.add(buttons[i]);
		   buttons[i].setFont(new Font("MV Boli",Font.BOLD,74));
		   buttons[i].setFocusable(false);
		   buttons[i].addActionListener(this);
		   buttons[i].setBackground(new Color(253,250,255));
		    }
   }
   public void actionPerformed(ActionEvent e) {
	     for(int i=0;i<9;i++) {
	    	 if(e.getSource()==buttons[i]) {
	    		 if(player1_turn) {
	    			 if(buttons[i].getText()=="") {
	    				  buttons[i].setForeground(new Color(252,7,11));
	    				 buttons[i].setText("X");
	    				 player1_turn=false;
	    				 textFeild.setText("O turn");
	    				 check();
	    			 }
	    		 }else {
	    			 if(buttons[i].getText()=="") {
	    				  buttons[i].setForeground(new Color(35,179,10));
	    				 buttons[i].setText("O");
	    				 player1_turn=true;
	    				 textFeild.setText("X turn");
	    				 check();
	    			 }
	    		 }
	    	 }
	     }
   }
   public void firstTurn() {
	   
	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textFeild.setText("X turn");
		}
		else {
			player1_turn=false;
			textFeild.setText("O turn");
		}
   }
   public void check() {
	 //check X win conditions
	 		if(
	 				(buttons[0].getText()=="X") &&
	 				(buttons[1].getText()=="X") &&
	 				(buttons[2].getText()=="X")
	 				) {
	 			xWins(0,1,2);
	 		}
	 		if(
	 				(buttons[3].getText()=="X") &&
	 				(buttons[4].getText()=="X") &&
	 				(buttons[5].getText()=="X")
	 				) {
	 			xWins(3,4,5);
	 		}
	 		if(
	 				(buttons[6].getText()=="X") &&
	 				(buttons[7].getText()=="X") &&
	 				(buttons[8].getText()=="X")
	 				) {
	 			xWins(6,7,8);
	 		}
	 		if(
	 				(buttons[0].getText()=="X") &&
	 				(buttons[3].getText()=="X") &&
	 				(buttons[6].getText()=="X")
	 				) {
	 			xWins(0,3,6);
	 		}
	 		if(
	 				(buttons[1].getText()=="X") &&
	 				(buttons[4].getText()=="X") &&
	 				(buttons[7].getText()=="X")
	 				) {
	 			xWins(1,4,7);
	 		}
	 		if(
	 				(buttons[2].getText()=="X") &&
	 				(buttons[5].getText()=="X") &&
	 				(buttons[8].getText()=="X")
	 				) {
	 			xWins(2,5,8);
	 		}
	 		if(
	 				(buttons[0].getText()=="X") &&
	 				(buttons[4].getText()=="X") &&
	 				(buttons[8].getText()=="X")
	 				) {
	 			xWins(0,4,8);
	 		}
	 		if(
	 				(buttons[2].getText()=="X") &&
	 				(buttons[4].getText()=="X") &&
	 				(buttons[6].getText()=="X")
	 				) {
	 			xWins(2,4,6);
	 		}
	 		//check O win conditions
	 		if(
	 				(buttons[0].getText()=="O") &&
	 				(buttons[1].getText()=="O") &&
	 				(buttons[2].getText()=="O")
	 				) {
	 			oWins(0,1,2);
	 		}
	 		if(
	 				(buttons[3].getText()=="O") &&
	 				(buttons[4].getText()=="O") &&
	 				(buttons[5].getText()=="O")
	 				) {
	 			oWins(3,4,5);
	 		}
	 		if(
	 				(buttons[6].getText()=="O") &&
	 				(buttons[7].getText()=="O") &&
	 				(buttons[8].getText()=="O")
	 				) {
	 			oWins(6,7,8);
	 		}
	 		if(
	 				(buttons[0].getText()=="O") &&
	 				(buttons[3].getText()=="O") &&
	 				(buttons[6].getText()=="O")
	 				) {
	 			oWins(0,3,6);
	 		}
	 		if(
	 				(buttons[1].getText()=="O") &&
	 				(buttons[4].getText()=="O") &&
	 				(buttons[7].getText()=="O")
	 				) {
	 			oWins(1,4,7);
	 		}
	 		if(
	 				(buttons[2].getText()=="O") &&
	 				(buttons[5].getText()=="O") &&
	 				(buttons[8].getText()=="O")
	 				) {
	 			oWins(2,5,8);
	 		}
	 		if(
	 				(buttons[0].getText()=="O") &&
	 				(buttons[4].getText()=="O") &&
	 				(buttons[8].getText()=="O")
	 				) {
	 			oWins(0,4,8);
	 		}
	 		if(
	 				(buttons[2].getText()=="O") &&
	 				(buttons[4].getText()=="O") &&
	 				(buttons[6].getText()=="O")
	 				) {
	 			oWins(2,4,6);
	 		}
   }
   public void xWins(int a,int b,int c) {
	   buttons[a].setBackground(new Color(254,255,15));
		buttons[b].setBackground(new Color(254,255,15));
		buttons[c].setBackground(new Color(254,255,15));
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textFeild.setText("X wins");
   }
 public void oWins(int a,int b,int c) {
	 buttons[a].setBackground(new Color(254,255,15));
		buttons[b].setBackground(new Color(254,255,15));
		buttons[c].setBackground(new Color(254,255,15));
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textFeild.setText("O wins");
   }
   
}