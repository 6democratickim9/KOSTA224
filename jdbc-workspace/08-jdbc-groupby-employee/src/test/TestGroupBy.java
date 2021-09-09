package test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestGroupBy {
	public static void main(String[] args) {
		try{
			EmployeeDAO dao=new EmployeeDAO();
			ArrayList<HashMap<String,Object>> list = dao.findJobGroupList();
			for(int i=0;i<list.size();i++) {
				HashMap<String.Object>map=list.get(i);
				System.out.println("job"+map.get("job")+" 사원수: "+map.get("empcount")+" 최고월급: "+map.get("highestsal"));
				
			}
				
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

}
