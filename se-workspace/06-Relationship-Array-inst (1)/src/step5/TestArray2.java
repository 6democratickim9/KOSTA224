package step5;

public class TestArray2 {
	public static void main(String[] args) {
		//배열 선언,생성 동시에 
		int salary[]=new int[4];
		salary[0]=400;
		salary[1]=500;
		salary[2]=700;
		salary[3]=600;
		int totalSalary=0;
		//for loop 를 이용해 총합을 구한다 
		for(int i=0;i<salary.length;i++) {
			totalSalary+=salary[i];
			//위 코드를 풀어보면 totalSalary=totalSalary+salary[i];
		}		
		System.out.println("totalSalary:"+totalSalary);
	}
}
