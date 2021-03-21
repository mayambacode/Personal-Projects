import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10]; //array of numbers 0-9
	JButton[] functionButtons = new JButton[8]; //array to hold functions. ex: add,subtract
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;// decimal,equal,delete,clear
	JPanel panel; // hold all the separate buttons
	
	Font myFont = new Font("Arial", Font.BOLD,30); //choose font,Bolded, and size
	
	double num1 = 0, num2 = 0, result = 0;
	char operator; //characters to hold + - x /
	
	
	Calculator(){
		
		frame = new JFrame("The Caculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of program
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);// stops you from editing in textfield
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("DELETE");
		clrButton = new JButton("CLEAR");
		
		
		//Adding buttons to functionButtons array
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		
		for(int i = 0; i < 8 ; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i = 0; i < 10 ; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		frame.add(textfield);
		frame.setVisible(true);
	}



	public static void main (String[] args) {
		Calculator calc = new Calculator();
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
