package gui;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class JFSignIn extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFSignIn frame = new JFSignIn();
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
	public JFSignIn() {
		setForeground(new Color(62, 115, 255));
		setAlwaysOnTop(true);
		setBackground(UIManager.getColor("Button.disabledShadow"));
		setTitle("Đăng nhập");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Downloads\\dictionary-icon.png"));
		setDefaultCloseOperation(JFSignIn.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JLabel lblSignIn = new JLabel("Đăng nhập");
		lblSignIn.setBackground(new Color(255, 255, 255));
		lblSignIn.setBounds(230, 0, 172, 84);
		lblSignIn.setForeground(new Color(37, 57, 111));
		lblSignIn.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel lblUsername = new JLabel("Tài khoản");
		lblUsername.setBounds(117, 125, 102, 21);
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel lblPassword = new JLabel("Mật khẩu");
		lblPassword.setLabelFor(lblPassword);
		lblPassword.setBounds(117, 194, 102, 26);
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		
		textFieldUsername = new JTextField();
		textFieldUsername.setMargin(new Insets(2, 6, 2, 2));
		lblUsername.setLabelFor(textFieldUsername);
		textFieldUsername.setBounds(245, 118, 239, 38);
		textFieldUsername.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldUsername.setBackground(UIManager.getColor("Button.highlight"));
		textFieldUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldUsername.setColumns(10);
		
		JButton btnSignIn = new JButton("Đăng nhập");
		btnSignIn.setBounds(117, 263, 367, 44);
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setBackground(new Color(37, 57, 111));
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.setLayout(null);
		contentPane.add(lblSignIn);
		contentPane.add(lblPassword);
		contentPane.add(lblUsername);
		contentPane.add(textFieldUsername);
		contentPane.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("Chưa có tài khoản?");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(193, 336, 131, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnSignUp = new JButton("Đăng ký");
		btnSignUp.setBorder(null);
		btnSignUp.setForeground(new Color(37, 57, 111));
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignUp.setBackground(new Color(255, 255, 255));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnSignUp.setBounds(328, 335, 70, 23);
		contentPane.add(btnSignUp);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setMargin(new Insets(2, 6, 2, 2));
		textFieldPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBackground(Color.WHITE);
		textFieldPassword.setBounds(245, 190, 239, 38);
		contentPane.add(textFieldPassword);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(242, 247, 255));
		panel.setBounds(0, 0, 596, 84);
		contentPane.add(panel);
	
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
}
