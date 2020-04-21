package com.MyApps;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class JApps extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApps frame = new JApps();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JApps() {
		setTitle("Java Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Notepad.main(new String[]{});
			}
		});
		btnNewButton.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/notepad.jpg")));
		
		JLabel lblJavaApplicationWorld = new JLabel("Java Applications");
		lblJavaApplicationWorld.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblJavaApplicationWorld.setForeground(new Color(204, 51, 51));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalculator.main(new String[]{});
			}
		});
		button.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/calculator.jpg")));
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IPFinder.main(new String[]{});
			}
		});
		button_1.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/ip.jpg")));
				
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharCount.main(new String[]{});
			}
		});
		button_4.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/wct.jpg")));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Puzzle.main(new String[]{});
			}
		});
		button_5.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/Puzzle Game.jpg")));
		


		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SourceGetter.main(new String[]{});
			}
		});
		button_7.setIcon(new ImageIcon(JApps.class.getResource("/com/MyApps/Source Code Generator.jpg")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(244)
							.addComponent(lblJavaApplicationWorld)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblJavaApplicationWorld)
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(237, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
