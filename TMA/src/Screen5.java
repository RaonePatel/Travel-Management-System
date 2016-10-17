import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Screen5 {

	private JFrame frame;
	private JTextField firstName;
	private JTextField emailId;
	private JTextField lastName;
	private JTextField contactNo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Screen5 window = new Screen5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Screen5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(74, 215, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 14, 80, 14);
		frame.getContentPane().add(lblFirstName);
		
		firstName = new JTextField();
		firstName.setBounds(100, 8, 86, 20);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(10, 39, 62, 14);
		frame.getContentPane().add(lblEmailId);
		
		emailId = new JTextField();
		emailId.setBounds(100, 33, 86, 20);
		frame.getContentPane().add(emailId);
		emailId.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(224, 11, 62, 14);
		frame.getContentPane().add(lblLastName);
		
		lastName = new JTextField();
		lastName.setBounds(314, 8, 86, 20);
		frame.getContentPane().add(lastName);
		lastName.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setBounds(10, 70, 62, 14);
		frame.getContentPane().add(lblContactNo);
		
		contactNo = new JTextField();
		contactNo.setBounds(100, 64, 86, 20);
		frame.getContentPane().add(contactNo);
		contactNo.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(224, 66, 62, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(291, 66, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnFemale);
		bg.add(rdbtnMale);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(firstName.getText());
				System.out.println(emailId.getText());
			}
		});
		btnNewButton.setBounds(31, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
