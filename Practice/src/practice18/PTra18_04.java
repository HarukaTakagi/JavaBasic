/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] lines = line.split(",", 0);
				Player player = new Player();

				player.setPosition(lines[0]);
				player.setName(lines[1]);
				player.setCountry(lines[2]);
				player.setTeam(lines[3]);

				array.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}


	// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		//シャッフルする
		Collections.shuffle(array);

		//今何名かカウントするための準備
		int[] num = {0,0,0,0};

		//規定数まで繰り返す
		for(int i = 0; i < array.size(); i++) {

			//GKを選出
			if(array.get(i).getPosition().equals("GK")) {
				System.out.println(array.get(i));

				//一名選出したらループ終了
				num[0]++;
				if(num[0]==1) {
					break;
				}
			}
		}
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getPosition().equals("DF")) {
				System.out.println(array.get(i));
				num[1]++;
				if(num[1]==4) {
					break;
				}
			}
		}
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getPosition().equals("MF")) {
				System.out.println(array.get(i));
				num[2]++;
				if(num[2]==4) {
					break;
				}
			}
		}
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getPosition().equals("FW")) {
				System.out.println(array.get(i));
				num[3]++;
				if(num[3]==2) {
					break;
				}
			}
		}

	}
}
