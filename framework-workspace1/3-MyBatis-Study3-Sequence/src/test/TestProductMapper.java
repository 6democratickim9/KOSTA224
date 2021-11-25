package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kosta.model.ProductMapper;
import org.kosta.model.ProductVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductMapper {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		ProductMapper m = (ProductMapper)ctx.getBean("productMapper");
////		System.out.println("total product number: "+m.getTotalProductCount());
//		List<String> makerList=m.getMakerKindList();
//		for(String maker:makerList) {
//			System.out.println(maker);
////		}
//		ProductVO paramVO =new ProductVO();
//		paramVO.setMaker("애플");
//		paramVO.setPrice(30);
//		List<ProductVO> list=m.findProductListByMakerAndPrice(paramVO);
//		printList(list);
		//3. 전달한 price보다 작은 price를 가진 상품정보 리스트를 조회
//		int price=100;
//		List<ProductVO> list=m.findProductListLessThanPrice(price);
		//4. 가격 구간별 상품리스트 조회
		int highPrice=140;
		int lowPrice=40;
		//java primitive data type에 매칭되는 java.lang계열 클래스 Byte, Short, Integer, Long..
		Map<String,Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("HIGHPRICE", highPrice);
		paramMap.put("LOWPRICE", lowPrice);
		
		printList(m.findProductListByLowPriceAndHighPrice(paramMap));
		
		ctx.close();
		
	}
	public static void printList(List<ProductVO> list) {
		for(ProductVO vo:list)
			System.out.println(vo);
	}

}
