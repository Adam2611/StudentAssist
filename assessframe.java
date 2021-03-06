
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class assessframe extends JFrame {
	public static Font f = new Font("Helvetica", Font.PLAIN, 18);
	private JFrame frame = new JFrame();
	mainScreen ms = new mainScreen();
	private static JTextField courseName = new JTextField();
	private static JLabel cn = new JLabel("Name:");
	private static JTextField teacher = new JTextField();
	private static JLabel t = new JLabel("Mark:");
	private static JTextField desiredmark = new JTextField();
	private static JLabel dm = new JLabel("Mark:");
	private static JTextField coursecode  = new JTextField();
	private static JLabel cc = new JLabel("Weight:");
	private static JButton b = new JButton("Done");
	
	
	public assessframe() {
		panels();
	}

	private void panels() {
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); // Show frame
		frame.setResizable(false); // Don't allow user to resize frame
		
		b.setLocation(260,290);
		b.setSize(100,40);
		b.setFont(f);
		b.setBackground(Color.orange);
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				assessment a = new assessment(Integer.parseInt(coursecode.getText()), Integer.parseInt(teacher.getText()), courseName.getText());
				ms.addassessment(a);
				frame.dispose();
			}
		});
		
		cn.setLocation(20,30);
		cn.setSize(200,40);
		cn.setFont(f);
		
		courseName.setLocation(20, 70);
		courseName.setSize(200,20);
		
		cc.setLocation(20,100);
		cc.setSize(200,40);
		cc.setFont(f);
		
		coursecode.setLocation(20, 150);
		coursecode.setSize(200,20);
		
		t.setLocation(20,180);
		t.setSize(200,40);
		t.setFont(f);
		
		teacher.setLocation(20, 230);
		teacher.setSize(200,20);
		
		dm.setLocation(20,260);
		dm.setSize(200,40);
		dm.setFont(f);
		
		desiredmark.setLocation(20, 310);
		desiredmark.setSize(200,20);
		
		frame.add(coursecode);
		frame.add(t);
		frame.add(teacher);
		frame.add(cc);
		frame.add(courseName);
		frame.add(cn);
		frame.add(b);
	}
}