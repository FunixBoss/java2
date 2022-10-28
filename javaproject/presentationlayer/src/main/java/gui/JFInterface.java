package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;

public class JFInterface extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldSearch;
	private Image logoImg = new ImageIcon(getClass().getResource("/image/dictionary-icon.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
	private Image searchImg = new ImageIcon(getClass().getResource("/image/search.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFInterface frame = new JFInterface();
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
	public JFInterface() {
		setTitle("EV Dictionary");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFDashboard.class.getResource("/image/dictionary-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 816);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 217, 777);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBackground(new Color(255, 255, 255));
		panelLogo.setLayout(null);
		panelLogo.setBounds(0, 0, 217, 61);
		panel.add(panelLogo);
		
		JLabel lblLogo = new JLabel("EV Dictionary");
		lblLogo.setForeground(new Color(37, 57, 111));
		lblLogo.setFont(new Font("Arial", Font.BOLD, 20));
		lblLogo.setBounds(70, 11, 134, 39);
		panelLogo.add(lblLogo);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(12, 5, 55, 50);
		panelLogo.add(lblIconLogo);
		lblIconLogo.setBackground(new Color(0, 0, 0));
		lblIconLogo.setIcon(new ImageIcon(logoImg));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(null);
		scrollPane_1.setBounds(0, 61, 217, 716);
		panel.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(242, 247, 255));
		panel_2.setBounds(217, 0, 877, 777);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDashboard = new JLabel("Tên từ vựng");
		lblDashboard.setForeground(new Color(37, 57, 111));
		lblDashboard.setFont(new Font("Arial", Font.BOLD, 20));
		lblDashboard.setBounds(31, 73, 134, 39);
		panel_2.add(lblDashboard);
		
		JLabel lblBreadcrumb = new JLabel("Trang chủ / Từ vựng");
		lblBreadcrumb.setBounds(712, 88, 115, 14);
		panel_2.add(lblBreadcrumb);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 877, 62);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(242, 247, 255));
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(searchImg));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(67, 98, 190));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(333, 11, 38, 36);
		panel_1.add(btnNewButton);
		
		txtFieldSearch = new JTextField();
		txtFieldSearch.setMargin(new Insets(2, 6, 2, 2));
		txtFieldSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtFieldSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtFieldSearch.setBorder(null);
		txtFieldSearch.setBounds(46, 11, 273, 36);
		panel_1.add(txtFieldSearch);
		txtFieldSearch.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSignUp_actionPerformed(e);
			}
		});

		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignUp.setBorder(null);
		btnSignUp.setBackground(new Color(67, 98, 190));
		btnSignUp.setBounds(656, 11, 76, 36);
		panel_1.add(btnSignUp);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSignIn_actionPerformed(e);
			}
		});
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(new Color(67, 98, 190));
		btnSignIn.setBounds(747, 11, 76, 36);
		panel_1.add(btnSignIn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.PLAIN, 12));
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(50, 115, 777, 615);
		panel_2.add(tabbedPane);
		JPanel p2=new JPanel();
		p2.setBackground(new Color(255, 255, 255));
		JPanel p3=new JPanel(); 
		p3.setBackground(new Color(255, 255, 255));
		JPanel p4=new JPanel(); 
		p4.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Danh từ ", p2);
		tabbedPane.addTab("Tính từ", p3);
		tabbedPane.addTab("Từ liên quan", p4);
		JPanel p1=new JPanel();
		p1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Động từ", p1);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btnSignUp_actionPerformed(ActionEvent e) {
		JFSignUp signUp = new JFSignUp();
		signUp.setVisible(true);
		JFInterface vocab = new JFInterface();
		vocab.setVisible(false);
	}
	protected void do_btnSignIn_actionPerformed(ActionEvent e) {
		JFInterface vocab = new JFInterface();
		vocab.setVisible(false);
		JFSignIn signIn = new JFSignIn();
		signIn.setVisible(true);
	}
}
