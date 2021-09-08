package model;

public interface DBInfo {
	//인터페이스이므로 아래field는 public static final로 인식된다
	String DRIVER="oracle.jdbc.OracleDriver";//상수라서 대문자
	String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USERNAME="scott";
	String PASSWORD="tiger";
}
