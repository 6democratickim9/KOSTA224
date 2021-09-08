package step6.solution;

public class CompanyService {
	//부모 Employee 타입의 배열로 선언해서 Employee 및 자식 객체들(Manager,Engineer)을 저장하게 한다 
	private Employee[] array;
	//현재 배열에 저장된 총 사원수 
	private int count;//instance variable은 선언만 해도 기본 초기화 0 
	public CompanyService(int length) {
		array=new Employee[length];// 전달받은 인자값 10 의 길이의 배열을 생성한다 ( 사원 객체들을 저장 ) 
	}
	public void add(Employee e) {
		array[count++]=e;//array의 count index 공간에 요소를 추가한 후 count는  1이 증가된다 
	}
	public void printAll() {
		for(int i=0;i<count;i++)
			System.out.println(array[i]);//println 내부적으로 toString()이 호출되어 출력된다 
	}
	/**
	 * 매개변수로 전달된 empNo 에 해당하는 사원 정보가 array 내에 존재하면 
	 * 해당 객체의 주소값을 반환하고 
	 * 존재하지 않으면 null을 반환 
	 * @param empNo
	 * @return employee
	 */
	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee=null;
		for(int i=0;i<count;i++) {
			if(empNo.equals(array[i].getEmpNo())) {//매개변수로 전달된 empNo와 배열 요소의 empNo가 일치하면 
				employee=array[i];
				break;// for을 벗어난다 
			}
		}		
		return employee;
	}
	public void deleteEmployeeByEmpNo(String empNo) {
		
		
	}
}

















