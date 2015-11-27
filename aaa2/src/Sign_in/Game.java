package Sign_in;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Game extends JFrame{
	private JButton btnNewButton = new JButton();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public Game() {
		initialize();
	}
	private void initialize() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		textField = new JTextField();
		textField.setText("");
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		setVisible(true);
		setBounds(100, 100, 519, 349);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
