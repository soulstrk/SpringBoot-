package com.soulstrk.mvc.board.vo;

public class BoardVo {
	private int num;
	private String writer;
	private String title;
	private String content;
	private int hit;
	private String pwd;
	
	public BoardVo() {
		// TODO Auto-generated constructor stub
	}

	public BoardVo(int num, String writer, String title, String content, int hit, String pwd) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.pwd = pwd;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "BoardVo [num=" + num + ", writer=" + writer + ", title=" + title + ", content=" + content + ", hit="
				+ hit + ", pwd=" + pwd + "]";
	}
	
	
}
