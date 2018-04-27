package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i = 0; i < 10; i++) { //行
			for (int j = 0; j < 5; j++) { //列
				if (j < i && i < 6) {
					System.out.print("■");
				} else if (i < 6) {
					System.out.print("□");
				} else if (i >= 6 && j < (10 - i)) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}

			System.out.println();
		}
	}
}
