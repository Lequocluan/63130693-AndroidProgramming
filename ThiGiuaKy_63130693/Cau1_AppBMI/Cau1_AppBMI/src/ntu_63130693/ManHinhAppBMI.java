package ntu_63130693;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

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
		panel.setBounds(49, 30, 268, 129);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Cân nặng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 25, 60, 20);
		panel.add(lblNewLabel);
		
		JLabel lblChieuCao = new JLabel("Chiều cao");
		lblChieuCao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChieuCao.setBounds(10, 70, 60, 20);
		panel.add(lblChieuCao);
		
		txtCannang = new JTextField();
		txtCannang.setColumns(10);
		txtCannang.setBounds(92, 21, 86, 31);
		panel.add(txtCannang);
		
		txtChieucao = new JTextField();
		txtChieucao.setColumns(10);
		txtChieucao.setBounds(92, 71, 86, 31);
		panel.add(txtChieucao);
		
		JButton btnClearCannang = new JButton("x");
		btnClearCannang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClearCannang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCannang.setText(null);
				txtCannang.requestFocus();
			}
		});
		btnClearCannang.setBounds(188, 20, 53, 31);
		panel.add(btnClearCannang);
		
		JButton btnClaerChieucao = new JButton("x");
		btnClaerChieucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChieucao.setText(null);
				txtChieucao.requestFocus();
			}
		});
		btnClaerChieucao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClaerChieucao.setBounds(188, 71, 53, 31);
		panel.add(btnClaerChieucao);
		
		JButton btnTinh = new JButton("Tính BMI");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TinhBMI();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinh.setBounds(49, 186, 169, 28);
		contentPane.add(btnTinh);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChieucao.setText(null);
				txtCannang.setText(null);
				txtCannang.requestFocus();
				txtThongbao.setText(null);
				txtKQ.setText(null);
			}
		});
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
		txtThongbao.setBounds(0, 81, 247, 32);
		panel_1.add(txtThongbao);
		txtThongbao.setColumns(10);
	}

	public void TinhBMI() {

//		lấy gtri Cannang va Chieucao dưới dạng chuỗi
		String str_Cannang = txtCannang.getText();
		String str_Chieucao = txtChieucao.getText();
		
		//xử lý khi dữ liệu trống
		if(str_Cannang.isEmpty() || str_Chieucao.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Cân nặng hoặc chiều cao không được để trống");
			return;
		}

		if(str_Chieucao.equals("0")) {
			JOptionPane.showMessageDialog(this, "Chiều cao không được bằng 0");
			return;
		}
		//chuyển đổi từ dạng chuỗi sang kiểu double
			Double Cannang = Double.parseDouble(str_Cannang);
			Double Chieucao = Double.parseDouble(str_Chieucao);
				
			//tính BMI
			float bmi = (float)(Cannang/(Chieucao*Chieucao));
			txtKQ.setText(String.valueOf(bmi));
			
			
	}
}
