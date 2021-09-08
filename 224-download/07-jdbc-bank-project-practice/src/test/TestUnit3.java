package test;

import model.AccountDAO;

public class TestUnit3 {
	public static void main(String[] args) {
		try {
			AccountDAO dao = new AccountDAO();
			String accountNo="11";
			String password = "1";
			int money = 0;
			dao.deposit(accountNo,password,money);
			System.out.println("입금완료");
		}catch(NoMoneyException e) {
			System.out.println(e.getMessage());
		}ctach(AccountNotFoundException e){
			System.out.println(e.getMessage());
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLExeption e) {
			e.printStackTrace();
		}
	}

}
