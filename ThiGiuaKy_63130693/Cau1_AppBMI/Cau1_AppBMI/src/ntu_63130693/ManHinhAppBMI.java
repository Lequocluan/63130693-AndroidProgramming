package ntu_63130693;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhAppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public ManHinhAppBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(70, 31, 247, 125);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Cân nặng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 25, 60, 20);
		panel.add(lblNewLabel);
		
		JLabel lblChiuCao = new JLabel("Chiều cao");
		lblChiuCao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChiuCao.setBounds(10, 70, 60, 20);
		panel.add(lblChiuCao);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 21, 86, 31);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 71, 86, 31);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("x");
		btnNewButton.setBounds(188, 26, 39, 20);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("x");
		btnNewButton_1.setBounds(188, 75, 39, 20);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tính BMI");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(49, 186, 169, 28);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(228, 189, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(70, 237, 247, 113);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html><div style='text-align: center;'>Chỉ số BMI<br> của bạn:<div></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(27, 11, 69, 43);
		panel_1.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(102, 8, 86, 46);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(27, 65, 188, 37);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
	}
}
