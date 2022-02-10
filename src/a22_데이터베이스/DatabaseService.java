package a22_데이터베이스;

import java.util.ArrayList;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class DatabaseService {

	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		//클래스명.getInstance() --> 싱글톤 사용하여, 딱 한번만 객체가 생성되도록 함
		UserDao userDao = new UserDao(pool);
		ProductDao productDao = new ProductDao(pool);
		
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
		//insertData.InsertUser(user1); --> 싱글톤이기에,  insertUser는 주석 해주어야 실행
		//System.out.println(userDao.getUser("abc"));
		
		
		//<<Product>
		Product product = Product.builder()
							.product_name("아이스 아메리카노")
							.category_code(3)
							.build();
		
		/*List에 많은 product객체를 넣는 구문
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		*/
		//<<insert>>
		//int insertCount = productDao.insertProducts(products);
		//System.out.println(insertCount);
		
		//<<delete>>
		//int deleteCount = productDao.deletProduct(8);
		//System.out.println(deleteCount);
		
		//<<update>>
		int updateCount = productDao.updateProductName(7, "자몽에이드");
		System.out.println(updateCount);
	
		//productDao.insertProduct(product);
		//System.out.println(productDao.getProduct(7));
		
	
		
		
		
		
		
		
	
		
		
	}
}


