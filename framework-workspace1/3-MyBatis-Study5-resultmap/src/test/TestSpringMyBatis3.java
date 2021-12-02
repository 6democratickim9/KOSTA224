package test;

import java.util.List;

import org.kosta.model.mapper.MovieMapper;
import org.kosta.model.vo.MovieVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Movie table에 영화정보 등록
//MovieVO has a DirectorVO 를 MyBatis로 처리하는 예제(MyBatis resultmap을 이용)
public class TestSpringMyBatis3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		MovieMapper mapper=(MovieMapper)ctx.getBean("movieMapper");
		//영화 타이틀과 감독명을 join해서 리스트 조회
		//영화 정보 등록
		List<MovieVO> list=mapper.getAllMovieList();
		for(MovieVO vo:list)
			System.out.println(vo.getTitle()+" "+vo.getDirectorVO().getDirectorName());
		ctx.close();
	}	

}
