package practice14.ptra14;

import practice14.common.JavaCourse;
import practice15.common.DBCourse;

public class Main {
	public static void main(String[] args) {
		JavaCourse java = new JavaCourse();
		System.out.println(java.getCourseName());
		for (int i = 0; i < java.getCourseUnit().length; i++) {
			System.out.println(java.getCourseUnit()[i]);
		}

		DBCourse db = new DBCourse();
		System.out.println(db.getCourseName());
		for(String unit : db.getCourseUnit()) {
			System.out.println(unit);
		}
	}

}
