package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import db.DBConnectionMgr;

public class ProductDao {
	private DBConnectionMgr pool;
	
	public ProductDao(DBConnectionMgr pool) {
		this.pool = pool;
	}
	
	
	//String Builder를 사용하여 데이터를 나열하는 메소드
	public String insertproductSqlValues(List<Product> products) {
		StringBuilder sqlValues = new StringBuilder();
		//foreach
		//sql문자열은 '' 을 넣어줘야하기때문에 ? (문자열) 양끝에 ''를 넣어줘야 함
		for(Product product : products) {
			sqlValues.append("(0, '");
			sqlValues.append(product.getProduct_name());
			sqlValues.append("' ,'");
			sqlValues.append(product.getCategory_code());
			sqlValues.append("', now(), now()), ");
		}
		//마지막 쉼표 , 를 지우는 명령 (sqlValues.length()-2 부터  sqlValues.length() 까지)
		sqlValues.delete(sqlValues.length()-2, sqlValues.length());
		
		return sqlValues.toString();
	}
	
	//<List>를 이용한 insert
	public int insertProducts(List<Product> products) {
		Connection con = null;
		String sql = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "insert into product_mst values" + insertproductSqlValues(products);
			pstmt = con.prepareStatement(sql);
			//executeUpdate 의 반환 자료형은 int --> 몇건을 입력했는지
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return 0;
	}
	

	
	
	//<<insert>>
	public int insertProduct(Product product) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = pool.getConnection();
			sql = "insert into product_mst values (0 ,? ,? , now(), now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product.getProduct_name());
			pstmt.setInt(2, product.getCategory_code());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return 0;
		
				
	}
	//<<select>>
	public Product getProduct(int product_code) {
		Product product = null;
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from product_mst where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = Product.builder()
						.product_code(rs.getInt(1))
						.product_name(rs.getString(2))
						.category_code(rs.getInt(3))
						.build();	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return product;
	}
	
	//<<Delete>>
	public int deletProduct(int product_code) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "delete from product_mst where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		return 0;
		
	}
	
	//<<Update>>
	//바꾸고자 하는 code의 입력할 name
	public int updateProductName(int product_code, String product_name) {
		String sql = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			//product code가 ? 인 데이터의 product name을 바꾸겠다
			sql = "update product_mst set product_name = ? where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product_name);
			pstmt.setInt(2, product_code);
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		//try가 실행되지 않을때 return값이 없다. 즉 입력한 데이터가 없기에 0으로 반환 해줌
		return 0;
		
		
	}
	
	

}
