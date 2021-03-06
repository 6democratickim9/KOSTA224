package org.kosta.webstudy16.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO : Data Access Object , VO : Value Object , DTO : Data Transfer Object , Service : Business Object 
// ProductDAO 에 Singleton Design Pattern 적용해서 
// 시스템 상에서 단 한번 객체를 생성해서 외부에서 사용하게 한다 
public class ProductDAO {
	private static ProductDAO instance=new ProductDAO();
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String password="tiger";
	private ProductDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	public static ProductDAO getInstance() {
		return instance;
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public ProductVO findProductById(String id) throws SQLException {
		ProductVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			String sql="select name,maker,price from web_product where id=?";
			pstmt=con.prepareStatement(sql);
			int pid=Integer.parseInt(id);
			pstmt.setInt(1, pid);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductVO(pid,rs.getString(1),rs.getString(2),rs.getInt(3));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public void register(ProductVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			String sql="insert into web_product(id,name,maker,price) values(web_product_seq.nextval,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
}





















