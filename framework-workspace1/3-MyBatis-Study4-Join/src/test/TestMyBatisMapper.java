package test;

import java.util.List;
import java.util.Map;

import org.kosta.model.HumanResourceMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatisMapper {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		HumanResourceMapper rm = (HumanResourceMapper) ctx.getBean("humanResourceMapper");
		// 1. 부서정보를 map으로 반환받는 테스트
		/*
		 * List<Map<String,Object>> list=rm.getAllDepartmentList();printInfo(list);
		 */
		// 2. inner join 연습
//		int empno=1;
//		Map<String,String> map=rm.findEmployeeAndDeptByEmpNo(empno);
//		if (map==null) {
//			System.out.println(empno+" 사원번호에 해당하는 사원이 없습니다");
//		}else {
//			System.out.println(map.get("ENAME")+" "+map.get("DNAME")+" "+map.get("LOC"));
//		}
//		List<Map<String,Object>> list=rm.getAllDepartmentList();
//		System.out.println(list);
//		
//		List<Map<String,Object>> list=rm.findEmployeeAndDeptListOuterJoin();
//		for(Map<String,Object>m:list) {
//			System.out.println(m.get("EMPNO")+" "+m.get("ENAME")+" "+m.get("DEPTNO")+" "+m.get("DNAME"));

//		List<Map<String, Object>> list = rm.getEmpGroupByDeptno();
//		for (Map<String, Object> m : list) {
//			System.out.println(m.get("DEPTNO") + "번 부서 " + m.get("DNAME") + " 사원수 " + m.get("EMP_COUNT"));

		//5. group by,inline view,outer join을 이용
		List<Map<String,Object>>list=rm.getEmpGroupByDeptnoOuterJoin();
		for(Map<String,Object> m:list)
			System.out.println(m.get("DEPTNO") + "번 부서 " + m.get("DNAME") + " 사원수 " + m.get("EMP_COUNT"));
		
		
			ctx.close();
		}
//	public static void printInfo(List<Map<String,Object>>list) {
//		for(Map<String,Object> m:list) {
//			System.out.println(m);
//		}
	}


