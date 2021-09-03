package test;

import java.sql.SQLException;

import model.ProductDAO;

public class TestProductDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDAO dao= new ProductDAO();
		int totalCount = dao.getProductTotalCount();
		System.out.println("총 상품수"+totalCount);
	}

}
