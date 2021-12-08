package org.kosta.myproject;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myproject.model.mapper.DepartmentMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootStudy2ApplicationTests {
	@Resource // @Autowired 와 동일한 역할 
	private DepartmentMapper deptMapper;
	@Test
	void contextLoads() {		
	}
	@Test
	void deptCount() {
		System.out.println("부서수:"+deptMapper.getTotalDepartmentCount());
	}
}







