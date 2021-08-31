package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
							//key:tel  value:Member 하위 
	private LinkedHashMap<String,Member> map=new LinkedHashMap<String,Member>();

	public void addMember(Member member) throws DuplicateTelException {
		if(map.containsKey(member.getTel()))//tel 이 존재하면
			throw new DuplicateTelException(member.getTel()+" tel 중복되어 등록불가합니다!");
		map.put(member.getTel(), member);
	}
	public void printAll() {
		Collection<Member> col=map.values();
		Iterator<Member> it=col.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false)
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다! ");
		return map.get(tel);
	}
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false)
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제불가");
		return map.remove(tel);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false)
			throw new MemberNotFoundException(member.getTel()
					+" tel에 해당하는 구성원 정보가 없어서 수정불가");
		map.put(member.getTel(), member);
	}
}



















