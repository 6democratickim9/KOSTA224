package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CardDAO {
	public CardDAO() throws ClassNotFoundException{
		Class.forName(DBinfo.DRIVER);
		
	}
	public void closeAll(PreparedStatement pstmt, Connection con)throws SQLException{
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			pstmt.close();
	}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}
//	Transaction 처리작업을 하지 않아서 문제 발생되는 메서드의 예
	
	public void registerCardAndPoint(String id, String name, String pointType,int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(DBinfo.URL,DBinfo.USERNAME,DBinfo.PASSWORD);
			String insertCardSql="insert into card(id,name) values(?,?)";
			String insertPointSql="insert into point(id,point_type,point) values(?,?,?)";
			pstmt=con.prepareStatement(insertCardSql);
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			int result = pstmt.executeUpdate();
			System.out.println("card registered: "+result);
			pstmt.close();
			pstmt=con.prepareStatement(insertPointSql);
			pstmt.setString(1,id);
			pstmt.setString(2,pointType);
			pstmt.setInt(3, point);
			int result2 = pstmt.executeUpdate();
			System.out.println("point registered: "+result2);
			
			}finally {
			closeAll(pstmt,con);
		}
		
	}
	
//	트랜잭션 처리작업으로 카드 및 포인트 등록시점에 모든 세부적인 작업이 정상적으로 진행되면 commit 해서 실제 db에 반영
	//세부 작업 중 하나라도 문제가 발생하면 진행되었던 작업은 롤백하여 작업을 취소하고 원상태로 되돌린다
	
	public void registerCardAndPointVer2(String id, String name, String pointType,int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(DBinfo.URL,DBinfo.USERNAME,DBinfo.PASSWORD);
			
			//트랜잭션 처리 작업을 위해 수동모드로 커밋 설정한다
			con.setAutoCommit(false);
			String insertCardSql="insert into card(id,name) values(?,?)";
			String insertPointSql="insert into point(id,point_type,point) values(?,?,?)";
			pstmt=con.prepareStatement(insertCardSql);
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			int result = pstmt.executeUpdate();
			System.out.println("card registered: "+result);
			pstmt.close();
			pstmt=con.prepareStatement(insertPointSql);
			pstmt.setString(1,id);
			pstmt.setString(2,pointType);
			pstmt.setInt(3, point);
			int result2 = pstmt.executeUpdate();
			System.out.println("point registered: "+result2);
			//트랜잭션 (카드등록 트랜잭션)내의 모든 작업이 정상적으로 진행되었으면 commit
			con.commit();
			System.out.println("**card와 point 등록작업이 정상적으로 진행되어 커밋완**");
			
			}catch(Exception e) {
				con.rollback();//작업 진행 내용ㅇ을 취소하고 원상태로 롤백한다
				System.out.println("card 등록 트랜잭션 내에서 예외 발생하여 롤백");
				throw e;//ㅎ출한 쪽으로 예외 상황을 전파
			}
		finally {
			closeAll(pstmt,con);
		}
		
	}

}


