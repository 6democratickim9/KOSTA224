package step6;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<ProductVO> list=new ArrayList<ProductVO>();
	public void addProduct(ProductVO productVO) {
		list.add(productVO);
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	public int getCartTotalPrice() {
		int totalPrice=0;
		for(int i=0;i<list.size();i++) {
			totalPrice+=list.get(i).getPrice();
		}
		return totalPrice;
	}
}













