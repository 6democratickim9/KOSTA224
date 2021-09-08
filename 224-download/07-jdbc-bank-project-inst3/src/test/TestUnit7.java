package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountNotFoundException;

//계좌이체 테스트
public class TestUnit7 {
	public static void main(String[] args) throws SQLException, AccountNotFoundException {
		try{
			AccountDAO dao = new AccountDAO();
			String senderAccountNo="1";
			String password="1234";
			int money=100;
			String receieverAccountNo="2";
			dao.transfer(senderAccountNo,password,money,receieverAccountNo);
			}
				
			catch(ClassNotFoundException e){
			e.printStackTrace();
			}
//		}catch(SQLException e) {
//			e.printStackTrace();
		}
}
