package org.kosta.springmvc04.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.springmvc04.model.domain.ItemDTO;

@Mapper
public interface ItemMapper {

	int getTotalItemCount();

	ItemDTO findItemByNo(int itemNo);


}
