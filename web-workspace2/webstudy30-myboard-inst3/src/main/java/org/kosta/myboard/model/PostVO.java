package org.kosta.myboard.model;

public class PostVO {
	private int no;
	private String title;
	private String content;
	private String timePosted;
	private int hits;
	private MemberVO memberVO;
	public PostVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostVO(int no, String title, String content, String timePosted, int hits, MemberVO memberVO) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.timePosted = timePosted;
		this.hits = hits;
		this.memberVO = memberVO;
	}
	public PostVO(String title, String content, MemberVO memberVO) {
		super();
		this.title = title;
		this.content = content;
		this.memberVO = memberVO;
	}
	

}
