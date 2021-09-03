package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ProductDAO;
import model.ProductDTO;

public class TestProductDAO5 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int highPrice=1700;
			int lowPrice = 1300;
			//lowprice 이상, highPrice이하 인 상품 리스트를ProductDTO순으로 조회
			ArrayList<ProductDTO> list = dao.findProductLisyByPriceOrderByPriceDesc(lowPrice,highPrice);
			for(int i =0; i<list.size();i++)
				System.out.println(list.get(i));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
