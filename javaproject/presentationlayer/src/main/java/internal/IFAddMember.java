package internal;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class IFAddMember extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField textEmail;
	private JTextField textPassword;
	private JTextField textResetPassword;
	private JTextField textPhone;
	private JTextField textDob;


	/**
	 * Create the frame.
	 */
	public IFAddMember() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IFAddMember.class.getResource("/image/dictionary-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm thành viên");
		lblNewLabel.setForeground(new Color(37, 57, 111));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 11, 219, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email ");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(32, 103, 102, 21);
		contentPane.add(lblEmail);
		panel.setBackground(new Color(242, 247, 255));
		panel.setBounds(0, 0, 954, 62);
		contentPane.add(panel);
		
		textEmail = new JTextField();
		textEmail.setMargin(new Insets(2, 6, 2, 2));
		textEmail.setHorizontalAlignment(SwingConstants.LEFT);
		textEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textEmail.setColumns(10);
		textEmail.setBackground(Color.WHITE);
		textEmail.setBounds(186, 94, 239, 38);
		contentPane.add(textEmail);
		
		JLabel lblPassword = new JLabel("Mật khẩu");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(32, 165, 102, 21);
		contentPane.add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setMargin(new Insets(2, 6, 2, 2));
		textPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		textPassword.setColumns(10);
		textPassword.setBackground(Color.WHITE);
		textPassword.setBounds(186, 156, 239, 38);
		contentPane.add(textPassword);
		
		JLabel lblResetPassword = new JLabel("Nhập lại mật khẩu");
		lblResetPassword.setForeground(Color.BLACK);
		lblResetPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblResetPassword.setBounds(32, 229, 130, 21);
		contentPane.add(lblResetPassword);
		
		textResetPassword = new JTextField();
		textResetPassword.setMargin(new Insets(2, 6, 2, 2));
		textResetPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textResetPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		textResetPassword.setColumns(10);
		textResetPassword.setBackground(Color.WHITE);
		textResetPassword.setBounds(186, 220, 239, 38);
		contentPane.add(textResetPassword);
		
		JLabel lblPhone = new JLabel("Số điện thoại");
		lblPhone.setForeground(Color.BLACK);
		lblPhone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPhone.setBounds(466, 102, 102, 21);
		contentPane.add(lblPhone);
		
		textPhone = new JTextField();
		textPhone.setMargin(new Insets(2, 6, 2, 2));
		textPhone.setHorizontalAlignment(SwingConstants.LEFT);
		textPhone.setFont(new Font("Arial", Font.PLAIN, 16));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		textPhone.setBounds(589, 93, 239, 38);
		contentPane.add(textPhone);
		
		JLabel lblDob = new JLabel("Ngày sinh");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDob.setBounds(466, 164, 102, 21);
		contentPane.add(lblDob);
		
		textDob = new JTextField();
		textDob.setMargin(new Insets(2, 6, 2, 2));
		textDob.setHorizontalAlignment(SwingConstants.LEFT);
		textDob.setFont(new Font("Arial", Font.PLAIN, 16));
		textDob.setColumns(10);
		textDob.setBackground(Color.WHITE);
		textDob.setBounds(589, 155, 239, 38);
		contentPane.add(textDob);
		
		JLabel lblLevel = new JLabel("Chức vụ");
		lblLevel.setForeground(Color.BLACK);
		lblLevel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLevel.setBounds(466, 228, 102, 21);
		contentPane.add(lblLevel);
		
		JComboBox cbbLevel = new JComboBox();
		cbbLevel.setModel(new DefaultComboBoxModel(new String[] {"Thành viên", "Quản trị viên", "Quản trị cấp cao"}));
		cbbLevel.setBounds(589, 220, 239, 38);
		contentPane.add(cbbLevel);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setBackground(new Color(67, 98, 190));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Arial", Font.BOLD, 16));
		btnAdd.setBounds(275, 308, 150, 44);
		contentPane.add(btnAdd);
		
		JButton btnReset = new JButton("Xóa");
		btnReset.setBackground(new Color(67, 98, 190));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Arial", Font.BOLD, 16));
		btnReset.setBounds(466, 308, 150, 44);
		contentPane.add(btnReset);
	}
}
