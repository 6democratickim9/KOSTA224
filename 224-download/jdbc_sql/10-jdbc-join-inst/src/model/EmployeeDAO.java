package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String password = "tiger";

	public EmployeeDAO() throws ClassNotFoundException {
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

	public EmployeeVO findEmployeeByEmpno(int empno) throws SQLException {
		EmployeeVO employeeVO=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			StringBuilder sql=new StringBuilder();
			sql.append("select e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel ");
			sql.append("from k_employee e, department d ");
			sql.append("where e.deptno=d.deptno and e.empno=?");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setInt(1, empno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				employeeVO=new EmployeeVO();
				employeeVO.setEmpno(empno);
				employeeVO.setEname(rs.getString(1));
				employeeVO.setSal(rs.getInt(2));
				DepartmentVO departmentVO=new DepartmentVO();
				departmentVO.setDeptno(rs.getInt(3));
				departmentVO.setDname(rs.getString(4));
				departmentVO.setLoc(rs.getString(5));
				departmentVO.setTel(rs.getString(6));
				employeeVO.setDepartmentVO(departmentVO);
				/*
				 employeeVO=new EmployeeVO(
				 empno,rs.getString(1),rs.getInt(2),new DepartmentVO(rs.getInt(3),
				 rs.getString(4),rs.getString(5),rs.getString(6)));				 
				 */
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return employeeVO;
	}
}










