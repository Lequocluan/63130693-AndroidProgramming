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
	private JTextField txtCannang;
	private JTextField txtChieucao;
	private JTextField txtKQ;
	private JTextField txtThongbao;

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
		
		txtCannang = new JTextField();
		txtCannang.setColumns(10);
		txtCannang.setBounds(92, 21, 86, 31);
		panel.add(txtCannang);
		
		txtChieucao = new JTextField();
		txtChieucao.setColumns(10);
		txtChieucao.setBounds(92, 71, 86, 31);
		panel.add(txtChieucao);
		
		JButton btnClearCannang = new JButton("x");
		btnClearCannang.setBounds(188, 26, 39, 20);
		panel.add(btnClearCannang);
		
		JButton btnClaerChieucao = new JButton("x");
		btnClaerChieucao.setBounds(188, 75, 39, 20);
		panel.add(btnClaerChieucao);
		
		JButton btnTinh = new JButton("Tính BMI");
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinh.setBounds(49, 186, 169, 28);
		contentPane.add(btnTinh);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(228, 189, 89, 23);
		contentPane.add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(70, 237, 247, 113);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html><div style='text-align: center;'>Chỉ số BMI<br> của bạn:<div></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(27, 11, 69, 43);
		panel_1.add(lblNewLabel_1);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(102, 8, 86, 46);
		panel_1.add(txtKQ);
		txtKQ.setColumns(10);
		
		txtThongbao = new JTextField();
		txtThongbao.setEditable(false);
		txtThongbao.setBounds(27, 65, 188, 37);
		panel_1.add(txtThongbao);
		txtThongbao.setColumns(10);
	}
}
