package org.kosta.model.member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void findMember() {
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("find member");
	}

	@Override
	public void findAllMember() {
		try {
			Thread.sleep(1800);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("find all member");
	}

	@Override
	public void register(String id, String name) throws DuplicatedIdException {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1100);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(id.equals("java"))
			throw new DuplicatedIdException("회원 아이디가 중복됩니다");
		System.out.println("register member");
	}

}
