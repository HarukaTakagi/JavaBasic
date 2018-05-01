package practice14.common;

public class DBCourse implements Course {
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	public String[] getCourseUnit() {
		String[] getCourseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return getCourseUnit;
	}

}
