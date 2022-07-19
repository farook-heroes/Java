

import javax.swing.*;
public class Swing
{
	JFrame frame;

	Swing()
	{
	
		frame=new JFrame("new way");
		JButton button = new JButton("Hi boys!");
		button.setBounds(200, 150, 90, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Swing();
	}
}

