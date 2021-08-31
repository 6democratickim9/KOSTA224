package view;

import java.io.IOException;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

//구성원 추가 및 전체회원보기, 검색 , 삭제 
//객체 직렬화를 통한 데이터 유지 
public class ConsoleInstUI6 {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() throws ClassNotFoundException, IOException {
		//구성원 정보를 로드한다 
		service.loadData();
		
		System.out.println("*******학사관리프로그램을 시작합니다 ver6******");
		// 제어문 label --> 아래 5 종료시 break만 명시하면 해당 switch문만
		// 벗어나므로 아래 while문 전체를 벗어나야 프로그램이 종료되므로
		// 레이블을 이용한다
		exit: while (true) {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String menu = scanner.nextLine();// 사용자로부터 메뉴번호를 입력받는다
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("**전체구성원보기**");
				service.printAll();
				break;
			case "5":
				//구성원 정보를 객체 직렬화하여 파일에 저장하게 한다 
				service.saveData();
				System.out.println("*******학사관리프로그램을 종료합니다******");
				break exit;// while문을 벗어나도록 레이블을 사용한다
			default: // 1~5 아닌 값은 default에서 처리
				System.out.println("잘못된 입력값입니다!");
			}// switch
		} // while
		scanner.close();
	}// execute method
		// 구성원 추가 작업을 담당하는 메서드
		// addView() 메서드 기능 추가 
		//1. 입력 구성원 종류를 잘못 입력했을 때 다시 입력받게 한다
		//2. 등록시 전화번호 입력받으면 그 즉시 중복여부를 확인해 중복될 경우 다시 전화번호를 입력받게 한다 
	public void addView() {
		//1번 추가구현사항
		String menu = null;
		
		while(true) {
			System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
			menu = scanner.nextLine();
			if(menu.equals("1")||menu.equals("2")||menu.equals("3"))//정상입력
				break;
			else
				System.out.println("1.학생,2.선생님,3.직원 중 하나의 메뉴를 선택하세요!");
		}
		
		//2번 추가구현사항 
		String tel = null;
		while(true) { // 중복된 전화번호가 입력될 경우 메세지 출력 후 계속 반복해서 입력받도록 한다 
			System.out.println("1. 전화번호를 입력하세요!");
			tel = scanner.nextLine();
			//SchoolService의 findMemberByTel(tel) 을 이용해본다
			try {
				service.findMemberByTel(tel);
				System.out.println("입력하신 "+tel+" tel 번호는 중복됩니다. 다시 입력하세요!");
				//catch 구문 수행되면 tel은 중복된 번호가 아님
			} catch (MemberNotFoundException e) {
				break;
			}
		}
		System.out.println("2. 이름을 입력하세요!");
		String name = scanner.nextLine();
		System.out.println("3. 주소를 입력하세요!");
		String address = scanner.nextLine();
		Member member = null;
		switch (menu) {
		case "1":
			System.out.println("4. 학번을 입력하세요!");
			String stuId = scanner.nextLine();
			member = new Student(tel, name, address, stuId);
			break;
		case "2":
			System.out.println("4. 과목을 입력하세요!");
			String subject = scanner.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. 부서를 입력하세요!");
			String dept = scanner.nextLine();
			member = new Employee(tel, name, address, dept);
			break;
		}
		try {
			service.addMember(member);
			System.out.println("리스트에 추가:" + member);
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}// addView method

	public void findView() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		try {
			Member p = service.findMemberByTel(tel);
			System.out.println("조회결과:" + p);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}// find method
	public void deleteView() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String tel=scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel+"에 해당하는 구성원을 삭제하였습니다.");
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}//delete method 
}// class





















