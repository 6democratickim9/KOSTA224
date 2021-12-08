package org.kosta.springmvc02.model.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
	public int getTotalCustomerCount();

}
