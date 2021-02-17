package exercise1212;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Converter implements ActionListener {

	JFrame window = new JFrame("Temperature Converter");
	JLabel fahrenheitLabel = new JLabel("Fahrenheit");
	JTextField fahrenheitText = new JTextField();
	JLabel celsiusLabel = new JLabel("Celsius");
	JTextField celsiusText = new JTextField("Result");
	JButton convertButton = new JButton("Convert");
	GridLayout gl = new GridLayout();
	
	Converter()
	{
		gl.setRows(3);
		gl.setColumns(2);
		
		window.setLayout(gl);
		
		convertButton.addActionListener(this);
		
		window.add(fahrenheitLabel);
		window.add(fahrenheitText);
		window.add(celsiusLabel);
		window.add(celsiusText);
		window.add(convertButton);
		
		window.setSize(400,150);
		window.setLocation(500, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);  
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
	
		if(ae.getSource()==convertButton)
		{
			double f = Double.parseDouble(fahrenheitText.getText());
			double c = (f-32.0)/(1.8);
			celsiusText.setText(""+c);
		}
	}
}
