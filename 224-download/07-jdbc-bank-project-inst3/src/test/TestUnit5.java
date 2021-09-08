package test;

import model.AccountDAO;

public class TestUnit5 {
	public static void main(String[] args) {
		
		try{
			AccountDAO dao = new AccountDAO();
			String accountNo="1";
			String password="1234";
			System.out.println("출금전 계좌잔액"+dao.findBalanceByAccountNo(accountNo, password));
			int money =100;
			System.out.println();
			dao.withdraw(accountNo);
		}
	}

}
