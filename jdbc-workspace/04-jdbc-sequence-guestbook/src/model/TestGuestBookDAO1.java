package model;

public class TestGuestBookDAO1 {
	public static void main(String[] args) {
		try {
			GuestBookDAO dao = new GuestBookDAO();
			GuestBookDTO dto = new GuestBookDTO("불금","짐옮겨야지!");
			dao.register(dto);
			System.out.println("registered!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
