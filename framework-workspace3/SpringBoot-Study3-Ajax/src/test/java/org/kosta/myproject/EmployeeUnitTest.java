package org.kosta.myproject;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myproject.model.mapper.EmployeeMapper;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeUnitTest {
	@Resource
	EmployeeMapper mapper;
	@Test
	void findEmployeeListByDeptNo() {
		System.out.println(mapper.findEmployeeListByDeptNo(10));
	}
	

}
