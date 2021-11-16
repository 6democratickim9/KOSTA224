package model;

public class MemberServiceImpl {
	//느슨한 결합도를 위해 인터페이스 타입으로 참조
	private MemberDAO memberDAO;
// 스프링 IOC(or DI) Container에서 memberDAO 구현체를 주입 -> Dependency Injection, DI
	public MemberServiceImpl() {
		super();
		this.memberDAO = memberDAO;
		// TODO Auto-generated constructor stub
	}
	public String findMemberById(String id) {
		return memberDAO.findMemberById(id);
	}

}
