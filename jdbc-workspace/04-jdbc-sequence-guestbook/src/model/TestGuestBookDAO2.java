package model;

import java.util.ArrayList;

public class TestGuestBookDAO2 {
	public static void main(String[] args) {
		try {
			GuestBookDAO dao = new GuestBookDAO();
			ArrayList<GuestBookDTO> list = dao.getAllGuestBookList();
			for(int i =0; i<list.size();i++)
				System.out.println(list.get(i));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public String
}

