package org.kosta.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.model.vo.DirectorVO;

//현 인터페이스를 구현하는 proxy객체를 생성하기 위해 아래 어노테이션 명시

@Mapper
public interface MovieMapper {

	public void registerDirector(DirectorVO directorVO);
	public List<DirectorVO> getAllDirectorList();
	
	
}
