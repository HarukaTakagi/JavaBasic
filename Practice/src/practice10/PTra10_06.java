package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 20;

		Car car2 = new Car();
		car2.color = "green";
		car2.gasoline = 80;

		Car car3 = new Car();
		car3.color = "pink";
		car3.gasoline = 60;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;


		final int distance = 300;

		for (int i = 0; i < car.length; i++) {
			int progress = 0;
			int n = 0;

			while (true) {
				int ru = car[i].run();
				n++;
				progress += ru;

				if(ru == -1) {
					System.out.println(car[i].color + "車は目的地にたどり着けませんでした");
					break;
				}

				if(progress >= distance) {
					System.out.println(car[i].color + "車は" + n + "時間で目的地に到着しました。ガソリンは残り" + car[i].gasoline + "リットルです。");
					break;
				}

			}
		}
	}
}
