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

public class JFVocab extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldSearch;
	private Image logoImg = new ImageIcon(getClass().getResource("/image/dictionary-icon.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
	private Image memberImg = new ImageIcon(getClass().getResource("/image/member.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image topicImg = new ImageIcon(getClass().getResource("/image/topic.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image adminImg = new ImageIcon(getClass().getResource("/image/admin.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image vocabImg = new ImageIcon(getClass().getResource("/image/vocab.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image searchImg = new ImageIcon(getClass().getResource("/image/search.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image avatarImg = new ImageIcon(getClass().getResource("/image/avatar.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFVocab frame = new JFVocab();
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
	public JFVocab() {
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
		lblDashboard.setBounds(50, 85, 134, 39);
		panel_2.add(lblDashboard);
		
		JLabel lblBreadcrumb = new JLabel("Trang chủ / Từ vựng");
		lblBreadcrumb.setBounds(712, 100, 115, 14);
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
		btnNewButton.setBounds(305, 11, 38, 36);
		panel_1.add(btnNewButton);
		
		txtFieldSearch = new JTextField();
		txtFieldSearch.setMargin(new Insets(2, 6, 2, 2));
		txtFieldSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtFieldSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtFieldSearch.setBorder(null);
		txtFieldSearch.setBounds(20, 11, 273, 36);
		panel_1.add(txtFieldSearch);
		txtFieldSearch.setColumns(10);
		
		JButton btnSignUp = new JButton("SignUp");
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 12));
		btnSignUp.setBorder(null);
		btnSignUp.setBackground(new Color(67, 98, 190));
		btnSignUp.setBounds(628, 11, 90, 36);
		panel_1.add(btnSignUp);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 12));
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(new Color(67, 98, 190));
		btnSignIn.setBounds(736, 11, 90, 36);
		panel_1.add(btnSignIn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.PLAIN, 12));
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(50, 138, 777, 592);
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
}
