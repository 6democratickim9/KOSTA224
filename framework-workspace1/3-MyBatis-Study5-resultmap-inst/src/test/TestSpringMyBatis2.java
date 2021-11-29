package test;

import java.util.List;

import org.kosta.model.mapper.MovieMapper;
import org.kosta.model.vo.DirectorVO;
import org.kosta.model.vo.MovieVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;

public class TestSpringMyBatis2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		MovieMapper mapper=(MovieMapper)ctx.getBean("movieMapper");
		DirectorVO dvo=new DirectorVO();
		dvo.setDirectorId(1);
		MovieVO movie=new MovieVO();
		movie.setTitle("기생충");
		movie.setGenre("코미디");
		movie.setAttendance(1000);
		movie.setDirectorVO(dvo);
		mapper.registerMovie(movie);
		System.out.println(dvo+"등록완료");
		ctx.close();
	}
}








