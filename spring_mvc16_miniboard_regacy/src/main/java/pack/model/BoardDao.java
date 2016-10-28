package pack.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.controller.BoardBean;

@Repository
public class BoardDao {
	private DataSource ds;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	@Autowired
	public BoardDao(DataSource dataSource) {
		try {
			ds = dataSource;
			} catch (Exception e) {
			System.out.println("DB 연결 실패 : "  +e);
		}
	}
	
	public List<BoardDto> list(){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from springboard order by num desc";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				BoardDto dto = new BoardDto();
				dto.setNum(rs.getInt("num"));
				dto.setAuthor(rs.getString("author"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setBwrite(rs.getString("bwrite"));
				dto.setReadcnt(rs.getInt("readcnt"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("list err : " + e );
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	public boolean writeData(BoardBean bean){
		boolean b = false;
		try {
			System.out.println(bean.getAuthor()+ " " + bean.getTitle() + " " + bean.getContent());
			String sql = "insert into springboard(author,title,content) values(?,?,?)";
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getAuthor());
			pstmt.setString(2, bean.getTitle());
			pstmt.setString(3, bean.getContent());
			
			int re = pstmt.executeUpdate();
			
			if (re > 0) {
				b = true;
			} else {
				b = false;
			}	
		} catch (Exception e) {
			System.out.println("writeData err : " + e);
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return b;
	}
	
	public List<BoardDto> search(String name, String value){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
//		
//		
//		
//		
		return list;
	}
	
	public BoardDto detail(String num){
		readcntUp(num);
		BoardDto dto = new BoardDto();
		String sql = "select * from springboard where num = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
		  	rs = pstmt.executeQuery();
			while(rs.next()){
				dto.setNum(rs.getInt("num"));
				dto.setAuthor(rs.getString("author"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setBwrite(rs.getString("bwrite"));
				dto.setReadcnt(rs.getInt("readcnt"));
			}
			
		} catch (Exception e) {
			System.out.println("detail err : " + e);
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return dto;
	}
	
	@RequestMapping(value="update" ,method=RequestMethod.GET)
	
	public boolean updateData(BoardBean bean){
		boolean b = false;
		String sql = "update springboard set author = ?, title= ?,content=? where num=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getAuthor());
			pstmt.setString(2, bean.getTitle());
			pstmt.setString(3, bean.getContent());
			pstmt.setInt(4, bean.getNum());
			
			int re = pstmt.executeUpdate();
			
			if (re > 0) {
				b = true;
			}else{
				b = false;
			}
		} catch (Exception e) {
			System.out.println("updateData err : " + e);
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
	public boolean deleteData(String num){
		boolean b = false;
		
		return b;
	}
	
	public void readcntUp(String num){
		String sql = "update springboard set readcnt = (readcnt + 1) where num=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeQuery();
		} catch (Exception e) {
			System.out.println("readcnt err : " + e);
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}































