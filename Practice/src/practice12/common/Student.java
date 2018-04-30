/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	// setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	// getter
	public int getStudentId() {
		return this.studentId;
	}

	// setter
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// getter
	public String getStudentName() {
		return this.studentName;
	}

	// setter
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	// getter
	public String getCompanytName() {
		return this.companyName;
	}

	// setter
	public void setMail(String mail) {
		this.mail = mail;
	}

	// getter
	public String getMail() {
		return this.mail;
	}

	// setter
	public void setPassword(String password) {
		this.password = password;
	}

	// getter
	public String getPassword() {
		return this.password;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}

	// getter
	public String getClassName() {
		return this.className;
	}
}
