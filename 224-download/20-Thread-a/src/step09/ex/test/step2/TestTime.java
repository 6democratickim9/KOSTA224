package step09.ex.test.step2;

import java.text.SimpleDateFormat;

public class TestTime {
// 유일한 파일명을 만들기 위해 시간정보를 이용하는 단위테스트
//	java: System.currentTimeMills()메서드 이용
//	반환되는 값이 long 차입, 세계 표준시 1970년 1월 1일 0시 0분 기준으로 몇 밀리세컨드가 흘렀는지 기록한 값-> 유닉스 시간
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		//시간 정보인 long 형 데이터를 시간 포맷을 설정해서 확인해본다
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		System.out.println(nowTime);
		
	}
}
