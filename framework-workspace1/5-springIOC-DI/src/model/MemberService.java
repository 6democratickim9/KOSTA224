package model;

public interface MemberService {
	/*
	 * 회원 등록 서비스
	 * 1. 회원 정보 등록
	 * 2. 포인트 정보 등록
	 * 트랜잭션 처리
	 * */
	void registerMemberAndPoint(String memberInfo, String pointInfo);
}
