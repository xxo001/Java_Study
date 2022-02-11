package a24_윈도우빌더;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import a24_윈도우빌더.Dao.UserDao;
import a24_윈도우빌더.Dto.User;
import a24_윈도우빌더.Service.UserService;
import a24_윈도우빌더.Service.UserServiceImpl;
import db.DBConnectionMgr;

public class CompanyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;

	private JPanel mainCard;
	//CardLayout의 기능을 사용할 수 있도록, CardLayout를 재정의
	private CardLayout cardLayout;
	private JPasswordField passwordText;
	private JTextField usernameText;

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
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		UserDao userDao = new UserDao(pool);
		userService = new UserServiceImpl(userDao);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1353, 511);
		mainCard = new JPanel();
		mainCard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCard);
		//CardLayout재정의
		cardLayout = new CardLayout(0, 0);
		mainCard.setLayout(cardLayout);
		
		JPanel loginPanel =new JPanel();
		//MainCard안에있는 loginPanel의 키값을 자동설정값에서, 임의로 변경
		mainCard.add(loginPanel, "loginpanel");
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
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("굴림", Font.PLAIN, 16));
		passwordText.setBounds(373, 238, 222, 37);
		loginPanel.add(passwordText);
		
		usernameText = new JTextField();
		usernameText.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		usernameText.setBounds(373, 186, 222, 37);
		loginPanel.add(usernameText);
		usernameText.setColumns(10);
		
		JLabel welcomeMessage = new JLabel("");
		
		JButton loginButton = new JButton("로그인");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Map에 키값과 그에맞는 문구를 넣어놓어, 상황에 따라 출력되도록 반환값을 resultMap에 저장
				Map<String, String> resultMap = userService.authLogin(usernameText.getText(), passwordText.getText());
				//타이틀값은 문구 뒤에 입력해주면 변경 가능 > 타이틀 변경뒤엔 각각 기능에 맞는 명령문을 넣어주어야함
				//MessageDialog = 문자출력 알림창 > 리턴값 void > 그냥 실행
				JOptionPane.showInternalMessageDialog(null, resultMap.get("content"), resultMap.get("title"), JOptionPane.PLAIN_MESSAGE);
				//로그인이될때 다른 페이지(index panel)가 위로 띄워지게 하는 명령
				if(resultMap.get("flag").equals("2")) {
					User user = userService.getUser(usernameText.getText());
					//다른페이지가 띄워진다고해서, 입력된 데이터가 지워진것이 아니기에, ""공백으로 지워주는 명령
					usernameText.setText("");
					passwordText.setText("");
					welcomeMessage.setText(user.getName() + " 님 환영합니다.");
					cardLayout.show(mainCard, "indexpanel");
					
					
				}
					
			}
		});
		loginButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loginButton.setBounds(301, 301, 296, 54);
		loginPanel.add(loginButton);
		
		JPanel indexPanel = new JPanel();
		//MainCard안에있는 loginPanel의 키값을 자동설정값에서, 임의로 변경
		mainCard.add(indexPanel, "indexpanel");
		indexPanel.setLayout(null);
		

		welcomeMessage.setBounds(28, 10, 149, 15);
		indexPanel.add(welcomeMessage);
	}
}
