package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JFMember extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldSearch;
	private Image logoImg = new ImageIcon(getClass().getResource("/image/dictionary-icon.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
	private Image memberImg = new ImageIcon(getClass().getResource("/image/member.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image topicImg = new ImageIcon(getClass().getResource("/image/topic.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image adminImg = new ImageIcon(getClass().getResource("/image/admin.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image vocabImg = new ImageIcon(getClass().getResource("/image/vocab.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image searchImg = new ImageIcon(getClass().getResource("/image/search.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image avatarImg = new ImageIcon(getClass().getResource("/image/avatar.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private JLabel lblStatusPage;
	private JLabel lblRowCount;
	
	Integer pageNumber = 1;
	Integer rowsOfPage = 10;
	Integer totalOfRows = 0; // tổng số row trong table 
	Double totalPage = 0.0;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFMember frame = new JFMember();
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
	public JFMember() {
		setTitle("Member");
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
		
		JPanel panelVocab = new JPanel();
		panelVocab.setBackground(new Color(255, 255, 255));
		panelVocab.setBounds(0, 175, 217, 50);
		panel.add(panelVocab);
		panelVocab.setLayout(null);
		
		JLabel lblIconVocab = new JLabel("");
		lblIconVocab.setBackground(new Color(255, 255, 255));
		lblIconVocab.setForeground(new Color(255, 255, 255));
		lblIconVocab.setBounds(30, 8, 29, 31);
		panelVocab.add(lblIconVocab);
		lblIconVocab.setIcon(new ImageIcon(vocabImg));
		
		JLabel lblVocab = new JLabel("Từ vựng");
		lblVocab.setFont(new Font("Arial", Font.BOLD, 16));
		lblVocab.setForeground(new Color(37, 57, 143));
		lblVocab.setBounds(78, 11, 94, 20);
		panelVocab.add(lblVocab);
		
		JPanel panelTopic = new JPanel();
		panelTopic.setBackground(new Color(255, 255, 255));
		panelTopic.setBounds(0, 226, 217, 50);
		panel.add(panelTopic);
		panelTopic.setLayout(null);
		
		JLabel lblTopic = new JLabel("Chủ đề");
		lblTopic.setForeground(new Color(37, 57, 143));
		lblTopic.setFont(new Font("Arial", Font.BOLD, 16));
		lblTopic.setBounds(78, 11, 87, 19);
		panelTopic.add(lblTopic);
		
		JLabel lblIconTopic = new JLabel("");
		lblIconTopic.setBounds(30, 8, 26, 28);
		panelTopic.add(lblIconTopic);
		lblIconTopic.setIcon(new ImageIcon(topicImg));
		
		JPanel panelMember = new JPanel();
		panelMember.setBackground(new Color(255, 255, 255));
		panelMember.setBounds(0, 277, 217, 50);
		panel.add(panelMember);
		panelMember.setLayout(null);
		
		JLabel lblMember = new JLabel("Thành viên");
		lblMember.setBounds(78, 11, 87, 19);
		panelMember.add(lblMember);
		lblMember.setForeground(new Color(37, 57, 143));
		lblMember.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblIconMember = new JLabel("");
		lblIconMember.setBounds(30, 8, 35, 28);
		panelMember.add(lblIconMember);
		lblIconMember.setIcon(new ImageIcon(memberImg));
		
		JPanel panelAdmin = new JPanel();
		panelAdmin.setBackground(new Color(255, 255, 255));
		panelAdmin.setBounds(0, 328, 217, 50);
		panel.add(panelAdmin);
		panelAdmin.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Quản trị viên");
		lblAdmin.setForeground(new Color(37, 57, 143));
		lblAdmin.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdmin.setBounds(78, 11, 128, 19);
		panelAdmin.add(lblAdmin);
		
		JLabel lblIconAdmin = new JLabel("");
		lblIconAdmin.setBounds(30, 8, 46, 24);
		panelAdmin.add(lblIconAdmin);
		lblIconAdmin.setIcon(new ImageIcon(adminImg));
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(242, 247, 255));
		panel_2.setBounds(217, 0, 877, 777);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDashboard = new JLabel("Thành viên");
		lblDashboard.setForeground(new Color(37, 57, 111));
		lblDashboard.setFont(new Font("Arial", Font.BOLD, 20));
		lblDashboard.setBounds(49, 85, 134, 39);
		panel_2.add(lblDashboard);
		
		JLabel lblBreadcrumb = new JLabel("Trang chủ / Thành viên");
		lblBreadcrumb.setBounds(701, 100, 134, 14);
		panel_2.add(lblBreadcrumb);
		
		lblStatusPage = new JLabel("Trang 1 of 0");
		lblStatusPage.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStatusPage.setBounds(91, 714, 104, 39);
		panel_2.add(lblStatusPage);
		
		lblRowCount = new JLabel("Số dòng: 0");
		lblRowCount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRowCount.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRowCount.setBounds(687, 720, 104, 27);
		panel_2.add(lblRowCount);
		
		JButton btnFirst = new JButton("Trang đầu");
		btnFirst.setForeground(new Color(255, 255, 255));
		btnFirst.setFont(new Font("Arial", Font.BOLD, 12));
		btnFirst.setBackground(new Color(67, 98, 190));
		btnFirst.setBounds(47, 658, 121, 40);
		panel_2.add(btnFirst);
		
		JButton btnLast = new JButton("Trang cuối");
		btnLast.setForeground(new Color(255, 255, 255));
		btnLast.setFont(new Font("Arial", Font.BOLD, 12));
		btnLast.setBackground(new Color(67, 98, 190));
		btnLast.setBounds(714, 658, 121, 40);
		panel_2.add(btnLast);
		
		JButton btnPrevious = new JButton("Trang trước");
		btnPrevious.setForeground(new Color(255, 255, 255));
		btnPrevious.setFont(new Font("Arial", Font.BOLD, 12));
		btnPrevious.setBackground(new Color(67, 98, 190));
		btnPrevious.setBounds(189, 658, 121, 40);
		panel_2.add(btnPrevious);
		
		JButton btnNext = new JButton("Trang sau");
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setFont(new Font("Arial", Font.BOLD, 12));
		btnNext.setBackground(new Color(67, 98, 190));
		btnNext.setBounds(572, 658, 121, 40);
		panel_2.add(btnNext);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10", "20", "50"}));
		comboBox_1.setBounds(331, 658, 220, 40);
		panel_2.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(259, 720, 384, 39);
		panel_2.add(textField);
		textField.setColumns(10);
		
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
		
		JLabel lblIconAvatar = new JLabel("");
		lblIconAvatar.setBounds(644, 11, 31, 36);
		panel_1.add(lblIconAvatar);
		lblIconAvatar.setIcon(new ImageIcon(avatarImg));
		
		JLabel lblAvatar = new JLabel("Nguyễn Khánh Hoàng Ân");
		lblAvatar.setForeground(new Color(37, 57, 111));
		lblAvatar.setFont(new Font("Arial", Font.BOLD, 13));
		lblAvatar.setBounds(685, 18, 170, 25);
		panel_1.add(lblAvatar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(0, 0, 0));
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(47, 135, 788, 500);
		panel_2.add(scrollPane);
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
}
