package org.kosta.springmvc04.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc04.model.domain.ItemDTO;
import org.kosta.springmvc04.model.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class ItemUnitTest {
	@Autowired
	private ItemMapper itemMapper;
	@Test
	public void getTotalItemCount() {
		System.out.println(itemMapper.getTotalItemCount());
	}
	@Test
	public void findItemByNo() {
		int itemNo=1;
		ItemDTO item=itemMapper.findItemByNo(itemNo);
		System.out.println(item);
	}
}






