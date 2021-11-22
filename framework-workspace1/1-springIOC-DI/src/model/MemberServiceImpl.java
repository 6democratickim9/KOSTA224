package model;
/*
 * Service: 비즈니스 계층, 비즈니스 로직 정의, 트랜잭션 처리
 * */


public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	private PointDAO pointDAO;
	
	
	
	public MemberServiceImpl(MemberDAO memberDAO, PointDAO pointDAO) {
		super();
		this.memberDAO = memberDAO;
		this.pointDAO = pointDAO;
	}



	@Override
	public void registerMemberAndPoint(String memberInfo, String pointInfo) {
		// TODO Auto-generated method stub
		memberDAO.register(memberInfo);
		pointDAO.register(pointInfo);

	}

}
