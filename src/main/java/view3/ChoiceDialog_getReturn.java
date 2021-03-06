package view3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view4.RunDialog_delivery1;
import view4.RunDialog_delivery2;
import view4.RunDialog_getReturnRefund1;
import view4.RunDialog_getReturnRefund2;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ChoiceDialog_getReturn extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ChoiceDialog_getReturn dialog = new ChoiceDialog_getReturn();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ChoiceDialog_getReturn() {
		setType(Type.UTILITY);
		setTitle("获取退货单类型选项");
		setBounds(100, 100, 384, 214);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 378, 175);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("oid1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					new RunDialog_getReturnRefund1().setVisible(true);
				}
			});
			btnNewButton.setBounds(44, 93, 104, 42);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton("oid2");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					new RunDialog_getReturnRefund2().setVisible(true);
				}
			});
			btnNewButton.setBounds(212, 93, 104, 42);
			contentPanel.add(btnNewButton);
		}
		{
			JLabel label = new JLabel("**以下按钮与你创建的天猫单类型一一对应**");
			label.setBounds(66, 15, 287, 42);
			contentPanel.add(label);
		}
	}

}
