package com.lec.grade.vo;

public class GradeVO {
	int sno;
	String name;
	int math;
	int kor;
	int eng;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "GradeVO [sno=" + sno + ", name=" + name + ", math=" + math + ", kor=" + kor + ", eng=" + eng + "]";
	}
	
	
	
	
	
}
