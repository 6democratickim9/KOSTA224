package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;

public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			ProductDTO dto = new ProductDTO("7","카스","OB",1700);
			
			if(dao.existsById(Integer.parseInt(dto.getId()))){
				System.out.println("상품이 존재하여 등록불가");
			}else {
				dao.register(dto);
				System.out.println("상품등록");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
