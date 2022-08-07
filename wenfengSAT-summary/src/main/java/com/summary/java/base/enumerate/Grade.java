package com.summary.java.base.enumerate;


/**
 * 
 * @Description： 使用枚举消除if else
 * 
 * @author [ Wenfeng.Huang ] on [2019年9月19日下午7:41:53]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public enum Grade {

	A_10_90(90, 100, "A"), B_90_80(80, 90, "B"), C_80_60(60, 80, "C"), D_60_0(0, 60, "D"), OTHER(-1, -1, "E");

	private int start;
	private int end;
	private String grade;

	Grade(int start, int end, String grade) {
		this.setStart(start);
		this.setEnd(end);
		this.setGrade(grade);
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static String getGrade(int score) {
		for (Grade grade : values()) {
			if (grade.getStart() <= score && score < grade.getEnd()) {
				return grade.getGrade();
			}
		}
		return OTHER.getGrade();
	}

}


