public class Matango extends Monster {
	/* 属性・フィールド */
	private int hp;// カプセル化したhpを設定
	final int MAX_HP = 100; //最大値

	public Matango(char suffix) {// コンストラクタ
		this.suffix = suffix; // this.
		this.setHp = 100; //HPの初期値を設定
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
				getName() + "になめられた！",
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
			int munus = -2;
			this.setHP(this.getHp() - minus);//マタンゴ自身のHP－２

			int r = new java.util.Random().nextInt(5);
			if(r % 2 == 1) {       //乱数を発生させ、もしも奇数なら、
				int damage_1 = 10; //相手に10のダメージ
				c.setHp(c.getHp() - damage_1);
				// 出力処理
				String[] comment = {
				this.getName() + "が毒を吐き出した！",
 				c.getName() + "に10のダメージ"
			};	
			}	else {             //乱数が偶数なら
				int damage_2 = 3;  //相手のMPを３奪う
				c.setMp(c.getMp() - damage_2);
				// 出力処理
				String[] comment = {
				this.getName() + "が毒を吐き出した！",
 				c.getName() + "のMPを3奪った"
 				};	
			}


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
 				c[i].getName() + "に５のダメージ！"
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
