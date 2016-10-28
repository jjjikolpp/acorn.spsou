package transaction_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionTest {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public TransactionTest() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123");
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e);
			return;
		}
		
		try {
			stmt = conn.createStatement();
			//트랜 잭션 처리
			conn.setAutoCommit(false);
			try {
				String ins = "insert into sangdata values(103,'상품4',3,5000)";
				stmt.executeUpdate(ins);
				//이런 저런 작업을 하다가...
				
				//레코드 수정
				String up = "update sangdata set sang='만년필' where code=103";
				stmt.executeUpdate(up);
				conn.commit();
			} catch (Exception e) {
				System.out.println("err : " + e);
				conn.rollback();
			} finally{
				conn.setAutoCommit(true);
			}
			
			String sql = "select * from sangdata";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+ " " + 
						rs.getString(2)+ " " + 
						rs.getString(3)+ " " + 
						rs.getString(4)
						);
			}
		} catch (Exception e) {
			System.out.println("처리 오류 : "  + e);
		}
	}
	
	public static void main(String[] args) {
		new TransactionTest();

	}
	
	
	

}
