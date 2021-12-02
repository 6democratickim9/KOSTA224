package test;

import org.kosta.model.mapper.MovieMapper;
import org.kosta.model.vo.DirectorVO;
import org.kosta.model.vo.MovieVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Movie table에 영화 등록, 영화 감독정보 join해서 조회
//MovieVO has a DirectorVO 를 MyBatis로 처리하는 예제(MyBatis resultmap을 이용)
public class TestSpringMyBatis2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		MovieMapper mapper=(MovieMapper)ctx.getBean("movieMapper");
		//영화 정보 등록
		DirectorVO dvo=new DirectorVO();
		dvo.setDirectorId(1);
		MovieVO movie=new MovieVO();
		movie.setTitle("바닷마을다이어리");
		movie.setGenre("드라마");
		movie.setAttendance(500);
		movie.setDirectorVO(dvo);
		mapper.registerMovie(movie);
		System.out.println(movie+"영화 등록 완료");
		ctx.close();
	}	

}
