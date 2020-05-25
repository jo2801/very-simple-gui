package firstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener { //Graphical User Interface; implement the ActionListener to be used with the button
	
	public int c = 0;
	JLabel label1;
	
	public GUI(){
		
		JFrame frame = new JFrame(); //create JFrame
		JPanel panel = new JPanel(); //create JPanel
		
		JButton button1 = new JButton("murder someone"); //create button1 & name it
		button1.addActionListener(this);
		
		label1 = new JLabel("number of murders: 0"); //create Label and write the text
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //Configure Panel
		panel.setLayout(new GridLayout(0,1));
		
		panel.add(button1); //add button1 to the panel
		panel.add(label1); // add label1 to the panel
		
		frame.add(panel,BorderLayout.CENTER); //add Panel to the Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stuff to close it
		frame.setTitle("GUI"); //set Title
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main (String[] args){
	
		new GUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		c++; //increase the value of the int
		label1.setText("number of murders: " + c); //update the label
		
	}
	
}
