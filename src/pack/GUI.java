package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{
	public JTextField textField;
	public GUI(Network network)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 140, 230);
		getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(24, 7, 21, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(41, 7, 21, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(58, 7, 21, 23);
		getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(76, 7, 21, 23);
		getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(24, 25, 21, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(41, 25, 21, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(58, 25, 21, 23);
		getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(76, 25, 21, 23);
		getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(24, 43, 21, 23);
		getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(41, 43, 21, 23);
		getContentPane().add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(58, 43, 21, 23);
		getContentPane().add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		checkBox_10.setBounds(76, 43, 21, 23);
		getContentPane().add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(24, 61, 21, 23);
		getContentPane().add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(41, 61, 21, 23);
		getContentPane().add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("");
		checkBox_13.setBounds(58, 61, 21, 23);
		getContentPane().add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("");
		checkBox_14.setBounds(76, 61, 21, 23);
		getContentPane().add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("");
		checkBox_15.setBounds(24, 80, 21, 23);
		getContentPane().add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("");
		checkBox_16.setBounds(41, 80, 21, 23);
		getContentPane().add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("");
		checkBox_17.setBounds(58, 80, 21, 23);
		getContentPane().add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("");
		checkBox_18.setBounds(76, 80, 21, 23);
		getContentPane().add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("");
		checkBox_19.setBounds(24, 99, 21, 23);
		getContentPane().add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("");
		checkBox_20.setBounds(41, 99, 21, 23);
		getContentPane().add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("");
		checkBox_21.setBounds(58, 99, 21, 23);
		getContentPane().add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("");
		checkBox_22.setBounds(76, 99, 21, 23);
		getContentPane().add(checkBox_22);
		
		JLabel lblOdpowiedz = new JLabel("Odpowiedz");
		lblOdpowiedz.setBounds(0, 137, 69, 14);
		getContentPane().add(lblOdpowiedz);
		
		textField = new JTextField();
		textField.setBounds(86, 134, 17, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Sprawdz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int [] answerTab = network.checkYourValue(new int[]
						{ chckbxNewCheckBox.isSelected() ? 1 :0,checkBox.isSelected() ? 1 :0,
								checkBox_1.isSelected() ? 1 :0,checkBox_2.isSelected() ? 1 :0,
								checkBox_3.isSelected() ? 1 :0,checkBox_4.isSelected() ? 1 :0,
								checkBox_5.isSelected() ? 1 :0,checkBox_6.isSelected() ? 1 :0,
								checkBox_7.isSelected() ? 1 :0,checkBox_8.isSelected() ? 1 :0,
								checkBox_9.isSelected() ? 1 :0,checkBox_10.isSelected() ? 1 :0,
								checkBox_11.isSelected() ? 1 :0,checkBox_12.isSelected() ? 1 :0,
								checkBox_13.isSelected() ? 1 :0,checkBox_14.isSelected() ? 1 :0,
								checkBox_15.isSelected() ? 1 :0,checkBox_16.isSelected() ? 1 :0,
								checkBox_17.isSelected() ? 1 :0,checkBox_18.isSelected() ? 1 :0,
								checkBox_19.isSelected() ? 1 :0,checkBox_20.isSelected() ? 1 :0,
								checkBox_21.isSelected() ? 1 :0,checkBox_22.isSelected() ? 1 :0});
				
				String tmp="";
				for (int i : answerTab)
				{
					tmp +=i;
				}
				String answer="";
				if(tmp.equals("00")) answer="0";
				else if (tmp.equals("01")) answer="1";
				else if(tmp.equals("10")) answer="2";
				else answer ="else";
				textField.setText(answer);
			}
		});
		btnNewButton.setBounds(0, 162, 124, 23);
		getContentPane().add(btnNewButton);
	}
}
