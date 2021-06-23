public class Matango extends Monster {
	/* 属性・フィールド */
	private int hp;// カプセル化したhpを設定
	public Matango(char suffix) {// コンストラクタ
		this.suffix = suffix; // this.
		this.hp = 100; //HPの初期値を設定
	}

	// Monster.getName のオーバーライド
	public String getName() {
		return "マタンゴ" + this.suffix;
	}



	/* 操作・メソッド */
	// キャラクターの固有メソッド
	
		// 攻撃1 なめる(相手に5のダメージを与える)
		public void attack(Character c) throws Exception {// キャラクタークラスを継承しているものすべてに適応
			// 内部処理
			int damage = 5;
			c.setHp(c.getHp() - damage);
			// 出力処理
			String[] comment = {
				this.getName() + "になめられた！",
				c.getName() + "に5のダメージ！",
				c.getName() + "のHPは残り" + c.getHp()
			};

			for(String cm : comment) {
				System.out.println(cm);

				Thread.sleep(1000);
			}
		}
		
		//　 制御不能、いったん保留（コード未完成）
		// 攻撃2　羽交い絞め（相手・装備の動作を1回止める)
// 		public void hold(Character c) throws Exception {
// 			//出力処理
// // 			String[] comment = {
// // 				"マタンゴ" + this.suffix + "の羽交い絞め！",
// // 				c.getName() + "は身動きが取れない・・・！"
// // 			};
// 			for(String cm : comment) {
// 				System.out.println(cm);
// 				Thread.sleep(1000);
// 			}
// 		}
	
		// 攻撃3　毒攻撃（相手に10のダメージ、もしくはMP-3のダメージ。攻撃内容はランダムに決定。マタンゴ自身もHPを2使用する。)　

		public void poison(Character c) throws Exception {

			this.hp -= 2; //マタンゴ　HP-2
			int r = new java.util.Random().nextInt(5);
			if(r % 2 == 1) {
				int damage = 10;
				c.setHp(c.getHp() - damage);
				// 出力処理
				String[] comment = {
				this.getName() + "が毒を吐き出した！",
 				c.getName() + "に10のダメージ"
			}	else {
				int m_damage = 3;
				c.setMp(c.getMp() - m_damage);
				// 出力処理
				String[] comment = {
				this.getName() + "が毒を吐き出した！",
 				c.getName() + "のMPを3奪った"	
			}
			// //出力処理
			// if(r % 2 == 1){
			// 	String[] comment = {
			// 	this.getName() + "が毒を吐き出した！",
 		// 		c.getName() + "に10のダメージ"
			// }	else {
			// 	String[] comment = {
			// 	this.getName() + "が毒を吐き出した！",
 		// 		c.getName() + "のMPを3奪った"				
			// };

			for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}

		//攻撃4　大暴れ　敵全員に5のダメージ
		public void rampage(Character... c) throws Exception {
			for(int i = 0; i < c.length; i++){
				c[i].setHp(c[i].getHp() - 5);
				
				//出力処理
				String[] comment = {
				this.getName() + "の大暴れ！！",
 				+ " 全員に５ずつのダメージ！"
			};
			}


			for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}

		// 逃げる
		public void run() {
			System.out.println(this.getName() + "は一目散に逃げ出した！");
		}

}
