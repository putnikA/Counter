import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
	private static JFrame frame;
	private static JPanel panel;
	private static JButton btnIncrement;
	private static JButton btnDecrement;
	private static JLabel label;
	private static int count;
	
	public static void main(String[] args) {
		Counter gui = new Counter();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame("Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		btnIncrement = new JButton("Increment");
		btnIncrement.setBounds(90, 10, 100, 50);
		panel.add(btnIncrement);
		btnIncrement.addActionListener(new Incrementer());
		
		btnDecrement = new JButton("Decrement");
		btnDecrement.setBounds(90, 190, 100, 50);
		panel.add(btnDecrement);
		btnDecrement.addActionListener(new Decrementer());
		
		label = new JLabel("0");
		label.setBounds(125, 100, 150, 50);
		label.setFont(new Font("Serif", Font.PLAIN, 60));
		panel.add(label);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	
	public class Incrementer implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText(String.valueOf(count));
		}
		
	}
	
	
	public class Decrementer implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			count--;
			label.setText(String.valueOf(count));
		}
		
	}
}
