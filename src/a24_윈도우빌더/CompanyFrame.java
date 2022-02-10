package a24_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompanyFrame extends JFrame {

	private JPanel MainCard;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyFrame frame = new CompanyFrame();
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
	public CompanyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1309, 501);
		MainCard = new JPanel();
		MainCard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainCard);
		MainCard.setLayout(new CardLayout(0, 0));
		
		JPanel loginPanel =new JPanel();
		MainCard.add(loginPanel, "name_9039980874100");
		loginPanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("아이디");
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		usernameLabel.setBounds(301, 194, 57, 15);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("비밀번호");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordLabel.setBounds(268, 246, 94, 15);
		loginPanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 16));
		passwordField.setBounds(373, 238, 222, 37);
		loginPanel.add(passwordField);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		textField.setBounds(373, 186, 222, 37);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JButton loginButton = new JButton("로그인");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("로그인 버튼 클릭");
			}
		});
		loginButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loginButton.setBounds(301, 301, 296, 54);
		loginPanel.add(loginButton);
		
		JPanel indexPanel = new JPanel();
		MainCard.add(indexPanel, "name_9043444537900");
		indexPanel.setLayout(null);
	}
}
