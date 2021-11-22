package model;

public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO;


	public void setProductDAO(ProductDAO productDAO) {
		System.out.println("setter DI: "+productDAO);
		this.productDAO=productDAO;
	}

	@Override
	public String findProductById(String id) {
		return productDAO.findProductById(id);
	}

}
