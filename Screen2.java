

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Screen2 window = new Screen2();
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
	public Screen2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New User");
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnSignIn = new JRadioButton("Sign In");
		frame.getContentPane().add(rdbtnSignIn);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnSignIn);
		bg.add(rdbtnNewRadioButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnSignIn.isSelected())
				{
					/*NewWindow nw=new NewWindow();
					nw.setVisible(true);*/
					
					ShoeDetails sd =new ShoeDetails();
					sd.setVisible(true);
					
					/**
					 * Ahiya shu lakhu to shoedeatisl ni paint method call thay ?
					 * ????????????????????????????/
					 * ????????????????????????
					 * ?????????????????
					 */
				
					
					frame.setVisible(false);
				}
			}
		});
		frame.getContentPane().add(btnSubmit);
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnFile.add(mntmLogin);
		
		JMenuItem mntmSdf = new JMenuItem("sdf");
		mnFile.add(mntmSdf);
	}

}
