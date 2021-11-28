package org.kosta.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
	public int getTotalProductCount();

	public List<String> getMakerKindList();

	public ProductVO findProductByNo(int productNo);

	public List<ProductVO> findProductListByMakerAndPrice(ProductVO paramVO);

	public List<ProductVO> findProductListLessThanPrice(int price);

	public List<ProductVO> findProductListByLowPriceAndHighPrice(Map<String, Integer> paramMap);

	public List<ProductVO> findProductListLikeKeyword(String keyword);

	public void register(ProductVO vo);

	public List<ProductVO> getAllProductList();

	public void registerVer2(ProductVO vo);
}







