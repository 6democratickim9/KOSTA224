package org.kosta.webstudy27.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
//모델을 조작
//user의 요청 처리
//UI에 출력할 View 결정
