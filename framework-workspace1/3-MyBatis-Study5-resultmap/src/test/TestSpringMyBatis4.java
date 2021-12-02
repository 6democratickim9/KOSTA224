package test;

import java.util.List;

import org.kosta.model.mapper.MovieMapper;
import org.kosta.model.vo.MovieVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Movie table에 영화정보 등록
//MovieVO has a DirectorVO 를 MyBatis로 처리하는 예제(MyBatis resultmap을 이용)
//영화 상세 정보조회
public class TestSpringMyBatis4 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		MovieMapper mapper = (MovieMapper) ctx.getBean("movieMapper");

		MovieVO vo = mapper.findMovieAndDirectorVOById(1);

		if (vo != null) {
			System.out.println(vo.getMovieId());
			System.out.println(vo.getTitle());
			System.out.println(vo.getGenre());
			System.out.println(vo.getAttendance());
			System.out.println(vo.getDirectorVO().getDirectorId());
			System.out.println(vo.getDirectorVO().getDirectorName());
			System.out.println(vo.getDirectorVO().getIntro());
			ctx.close();
		}
		else {
			System.out.println("조회된 정보가 없습니다");
		}
	}

}
