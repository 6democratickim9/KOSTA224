package org.kosta.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
	public int getTotalProductCount();
	public List<String> getMakerKindList();
	public List<ProductVO> findProductListByMakerAndPrice(ProductVO paramVO);
	public List<ProductVO> findProductListLessThanPrice(int price);
	public List<ProductVO> findProductListByLowPriceAndHighPrice(Map<String, Integer> paramMap);

}
