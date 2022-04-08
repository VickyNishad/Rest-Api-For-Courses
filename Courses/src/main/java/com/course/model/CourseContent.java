package com.course.model;

public class CourseContent {
	private String link1;
	private String link2;
	private String link3;
	private String link4;
	private String link5;
	private String link6;
	public CourseContent(String link1, String link2, String link3, String link4, String link5, String link6) {
		super();
		this.link1 = link1;
		this.link2 = link2;
		this.link3 = link3;
		this.link4 = link4;
		this.link5 = link5;
		this.link6 = link6;
	}
	public CourseContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLink1() {
		return link1;
	}
	public void setLink1(String link1) {
		this.link1 = link1;
	}
	public String getLink2() {
		return link2;
	}
	public void setLink2(String link2) {
		this.link2 = link2;
	}
	public String getLink3() {
		return link3;
	}
	public void setLink3(String link3) {
		this.link3 = link3;
	}
	public String getLink4() {
		return link4;
	}
	public void setLink4(String link4) {
		this.link4 = link4;
	}
	public String getLink5() {
		return link5;
	}
	public void setLink5(String link5) {
		this.link5 = link5;
	}
	public String getLink6() {
		return link6;
	}
	public void setLink6(String link6) {
		this.link6 = link6;
	}
	@Override
	public String toString() {
		return "CourseContent [link1=" + link1 + ", link2=" + link2 + ", link3=" + link3 + ", link4=" + link4
				+ ", link5=" + link5 + ", link6=" + link6 + "]";
	}
	
}
