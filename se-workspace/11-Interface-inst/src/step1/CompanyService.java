package step1;

public class CompanyService {
	// 부모 Employee 타입의 배열로 선언해서 Employee 및 자식 객체들(Manager,Engineer)을 저장하게 한다
	private Employee[] array;
	// 현재 배열에 저장된 총 사원수
	private int count;// instance variable은 선언만 해도 기본 초기화 0

	public CompanyService(int length) {
		array = new Employee[length];// 전달받은 인자값 10 의 길이의 배열을 생성한다 ( 사원 객체들을 저장 )
	}

	public void add(Employee e) {
		array[count++] = e;// array의 count index 공간에 요소를 추가한 후 count는 1이 증가된다
	}

	public void printAll() {
		for (int i = 0; i < count; i++)
			System.out.println(array[i]);// println 내부적으로 toString()이 호출되어 출력된다
	}

	/**
	 * 매개변수로 전달된 empNo 에 해당하는 사원 정보가 array 내에 존재하면 해당 객체의 주소값을 반환하고 존재하지 않으면 null을
	 * 반환
	 * 
	 * @param empNo
	 * @return employee
	 */
	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee = null;
		for (int i = 0; i < count; i++) {
			if (empNo.equals(array[i].getEmpNo())) {// 매개변수로 전달된 empNo와 배열 요소의 empNo가 일치하면
				employee = array[i];
				break;// for을 벗어난다
			}
		}
		return employee;
	}

	/**
	 * 매개변수의 인자값을 전달된 사원번호empNo와 배열 내의 요소의 사원번호가 일치하면 배열의 위치를 반환하는 메서드 , 만약 일치하는 요소가
	 * 없으면 -1을 반환
	 * 
	 * @param empNo
	 * @return position
	 */
	public int findPositionByEmpNo(String empNo) {
		int position = -1;
		for (int i = 0; i < count; i++) {
			if (empNo.equals(array[i].getEmpNo())) {
				position = i;
				break;
			} // if
		} // for
		return position;
	}// method

	/**
	 * 사원 정보를 삭제하는 메서드 
	 * 매개변수로 전달된 인자값 empNo에 해당하는 사원객체가 배열요소로 존재하면 삭제하는 메서드 
	 * 만약 사원번호에 일치하는 배열 요소가 없다면 ex) 99 사원번호에 해당하는 사원이 없어서 삭제불가 라는 메세지를 남긴다
	 * 
	 * 일치하는 사원이 있으면 해당 사원이 배열에 위치한 position 을 이용해 그 시점부터 
	 * 총사원수(count)보다 작을 동안 반복하면서 뒤 요소를 앞요소로 할당하는 방식으로 삭제한다 
	 * ( ex -> array[i]=array[i+1]  ) 
	 * 삭제한 후 총사원수는 -1 감소시킨다 
	 * 만약 삭제할 요소가 배열의 마지막 요소라면 array[i]=array[i+1]; 작업이 불가능하므로 이 경우에는 직접 null을 할당한다
	 *  ( array.length 를 이용하면 배열의 마지막 요소인지 확인 가능하다 ) 
	 *  
	 * @param empNo
	 */
	public void deleteEmployeeByEmpNo(String empNo) {
		int position=findPositionByEmpNo(empNo);
		if(position==-1) {//사원번호에 해당하는 사원이 배열 내에 없다면 
			System.out.println(empNo+" 사원번호에 해당하는 사원이 없어서 삭제불가");
		}else {
			for(int i=position;i<count;i++) {
				if(i+1==array.length) {//삭제할 요소가 배열의 마지막 요소라면 
					array[i]=null;
				}else {
					array[i]=array[i+1];
				}
			}//for
			count--;//삭제했으므로 총사원수를 -1 한다 
		}
	}// method
}// class









