package org.kosta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Component 계열 어노테이션 -> spring container에게 객체 bean 생성할 것을 명시 
@Service
public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO;
   @Autowired // DI 계열 어노테이션 -> spring container에게 dependency injection 하라고 명시 
	public ProductServiceImpl(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}	

	@Override
	public void register(String productInfo) {
		productDAO.register(productInfo);
	}
}
