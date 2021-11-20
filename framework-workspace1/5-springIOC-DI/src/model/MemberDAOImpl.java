package model;

import java.sql.SQLException;

import javax.sql.DataSource;

public class MemberDAOImpl implements MemberDAO {
	private DataSource dataSource;

	public MemberDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void register(String memberInfo) {
		// TODO Auto-generated method stub
		try {
					System.out.println(memberInfo+" 회원정보를 db에 등록"
					+dataSource.getConnection());
		}catch(SQLException e){
			e.printStackTrace();
			
		}

	}

}
