package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String password = "tiger";

	public ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	public ArrayList<HashMap<String, Object>> findProductMakerGroupLessThanAvgPrice() throws SQLException {
		ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String, Object>>();
		//HashMap<String,Object> map=new HashMap<String,Object>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			StringBuilder sql=new StringBuilder("select maker,round(avg(price)) as avgprice ");
			sql.append("from product ");
			sql.append("group by maker ");
			sql.append("having round(avg(price))<(select round(avg(price)) from product) ");
			sql.append("order by avgprice desc");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {	
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("maker",rs.getString(1));
				map.put("avgprice", rs.getInt(2));
				list.add(map);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}

































