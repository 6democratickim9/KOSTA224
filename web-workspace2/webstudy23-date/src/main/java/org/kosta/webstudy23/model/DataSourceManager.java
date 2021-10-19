package org.kosta.webstudy23.model;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DataSourceManager {
	private static DataSourceManager instance = new DataSourceManager();
	private DataSource dataSource;
	private DataSourceManager() {
		BasicDataSource dbcp = new BasicDataSource();
		dbcp.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("scott");
		dbcp.setUsername("tiger");
		//서비스 환경에 맞게 설정할 수 있다
		dbcp.setInitialSize(5);
		//dbcp생성시점에 Connection Pool에 connection 객체를 5개 생성해 놓는다
		dbcp.setMaxTotal(25);
		this.dataSource=dbcp;//이런식으로 할당해줌. 하위클래스 타입으로 할당해야 메소드가 호출됨. 관리는 다형성에 의해 부모 및 상위인터페이스에 다양한 객체들이 참조될 수 있음
	}
	public static DataSourceManager getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
}
