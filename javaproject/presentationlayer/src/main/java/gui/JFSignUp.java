package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Insets;

public class JFSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	private JTextField textFieldResetPassword;
	private JTextField textFieldEmail;
	private JTextField textFieldDob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFSignUp frame = new JFSignUp();
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
	public JFSignUp() {
		setBackground(new Color(62, 115, 255));
		setTitle("Đăng ký");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Downloads\\dictionary-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Đăng ký");
		lblSignUp.setForeground(new Color(37, 57, 111));
		lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));
		lblSignUp.setBackground(new Color(62, 115, 255));
		lblSignUp.setBounds(246, 0, 140, 84);
		contentPane.add(lblSignUp);
		
		JLabel lblUsername = new JLabel("Tài khoản");
		lblUsername.setLabelFor(lblUsername);
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUsername.setBounds(106, 123, 102, 21);
		contentPane.add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setMargin(new Insets(2, 6, 2, 2));
		textFieldUsername.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBackground(Color.WHITE);
		textFieldUsername.setBounds(256, 116, 239, 38);
		contentPane.add(textFieldUsername);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setMargin(new Insets(2, 6, 2, 2));
		textFieldPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBackground(Color.WHITE);
		textFieldPassword.setBounds(256, 192, 239, 38);
		contentPane.add(textFieldPassword);
		
		JLabel lblPassword = new JLabel("Mật khẩu");
		lblPassword.setLabelFor(textFieldPassword);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPassword.setBounds(106, 199, 102, 21);
		contentPane.add(lblPassword);
		
		JLabel lblResetPassword = new JLabel("Nhập lại mật khẩu");
		lblResetPassword.setForeground(Color.BLACK);
		lblResetPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		lblResetPassword.setBounds(106, 274, 130, 21);
		contentPane.add(lblResetPassword);
		
		textFieldResetPassword = new JTextField();
		lblResetPassword.setLabelFor(textFieldResetPassword);
		textFieldResetPassword.setMargin(new Insets(2, 6, 2, 2));
		textFieldResetPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldResetPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		textFieldResetPassword.setColumns(10);
		textFieldResetPassword.setBackground(Color.WHITE);
		textFieldResetPassword.setBounds(256, 267, 239, 38);
		contentPane.add(textFieldResetPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(106, 352, 102, 21);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		lblEmail.setLabelFor(textFieldEmail);
		textFieldEmail.setMargin(new Insets(2, 6, 2, 2));
		textFieldEmail.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBackground(Color.WHITE);
		textFieldEmail.setBounds(256, 345, 239, 38);
		contentPane.add(textFieldEmail);
		
		JLabel lblDob = new JLabel("Ngày sinh");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDob.setBounds(106, 434, 102, 21);
		contentPane.add(lblDob);
		
		textFieldDob = new JTextField();
		lblDob.setLabelFor(textFieldDob);
		textFieldDob.setMargin(new Insets(2, 6, 2, 2));
		textFieldDob.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldDob.setFont(new Font("Arial", Font.PLAIN, 16));
		textFieldDob.setColumns(10);
		textFieldDob.setBackground(Color.WHITE);
		textFieldDob.setBounds(256, 427, 239, 38);
		contentPane.add(textFieldDob);
		
		JButton btnSignUp = new JButton("Đăng ký");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 18));
		btnSignUp.setBackground(new Color(37, 57, 111));
		btnSignUp.setBounds(106, 521, 389, 44);
		contentPane.add(btnSignUp);
		
		JLabel lblText = new JLabel("Đã có tài khoản?");
		lblText.setFont(new Font("Arial", Font.PLAIN, 14));
		lblText.setBounds(194, 600, 117, 21);
		contentPane.add(lblText);
		
		JButton btnSignIn = new JButton("Đăng nhập");
		btnSignIn.setForeground(new Color(37, 57, 111));
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(Color.WHITE);
		btnSignIn.setBounds(307, 599, 92, 23);
		contentPane.add(btnSignIn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(242, 247, 255));
		panel.setBounds(0, 0, 596, 84);
		contentPane.add(panel);
	}

}
