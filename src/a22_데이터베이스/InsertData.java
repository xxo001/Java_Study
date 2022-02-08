package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class InsertData {
	//통상 pool로 칭함 
	private DBConnectionMgr pool;
	
	//생성될때 pool을 매개변수로 받고 this.pool에 대입
	public InsertData(DBConnectionMgr pool) {
		this.pool = pool; 
	}
	//*******쿼리에서의 INSERT를 명령*********중요
	public void InsertUser(User user) {	
		//dbconnection을 사용할때 필요한 클래스 들
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		//DBConnectionMg에서getConnection을 예외처리 미루기를 했기에, 예외처리를 꼭 해주어야 사용가능
		try {
			//getConnection을 통해 db에 접근
			con = pool.getConnection();
			//쿼리문 작성
			sql = "insert into user_mst values(0, ?, ?, ?, ?, now(), now())";
			//getConnection에있는 prepareStatement를 통해 ? 완성
			pstmt = con.prepareStatement(sql);
			//물음표가 모두 String이기에 setString사용
			//순서는 index순서가 아닌 물음표의 순서로 입력
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			//쿼리문에서의 실행을 하는 역할
			pstmt.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//getConnection에서 빌려온 db접근권한을 반납 하는 명령
			pool.freeConnection(con, pstmt);
		}
		
		System.out.println("회원 가입 완료");
		
		
	}
	//*******쿼리에서의 SELECT 명령******중요
	//--> 해당 username을 가진 User객체를 가져와서 user에 return
	//select시에는 ResultSet도 필요 함
	public User getUser(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//return받을 user객체도 필요
		User user = null;
		
		try {
			//getConnection을 통해 db에 접근
			con = pool.getConnection();
			//쿼리문 작성
			sql = "select * from user_mst where username = ?" ;
			//getConnection에있는 prepareStatement를 통해 ? 완성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "abc");
			//select는 executeQuery()를 사용 --> returtn값이 ResultSet이기에 rs에 대입
			rs = pstmt.executeQuery();
			//BOF에 커서가 있다가, next를 받고 데이터가 있는, 아래 행으로 내려와짐
			rs.next();
			//데이터들을 user객체를 만들어 안에에 넣어야 함
			//ResultSet는 컬렉션의 set과 같은 개념이기에, iterator를 통해 순서대로 정렬되어있음
			user = User.builder()
						.user_code(rs.getInt(1)) 
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.build();
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			//getConnection에서 빌려온 db접근권한을 반납 하는 명령
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	}
	

	public static void main(String[] args) {
		//클래스명.getInstance() --> 싱글톤 사용하여, 딱 한번만 객체가 생성되도록 함
		InsertData insertData = new InsertData(DBConnectionMgr.getInstance());
		
		//builder를 통한 데이터 입력
		User user1 = User.builder()
						.username("abc")
						.password("1234")
						.name("김재현")
						.email("gsr0920@naver.com")
						.phone("01066106518")
						.addr("부산 부산진구")
						.build();
		
		//객체를 호출
		//insertData.InsertUser(user1); --> 싱글톤이기에,  inserUser는 주석 해주어야 실행
		System.out.println(insertData.getUser("abc"));
	}

}
