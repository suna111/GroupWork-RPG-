public class Matango extends Monster {
	/* 属性・フィールド */
	int hp = 100;// 初期値
	public Matango(char suffix) {// コンストラクタ
		this.suffix = suffix;
	}

	// Monster.getName のオーバーライド
	public String getName() {
		return "マタンゴ" + this.suffix;
	}

	// HPを取得する(getter)
	public int getHp() {
		return this.hp;
	}
	// HPを設定する(setter)
	public void setHP(int hp) {
		if(hp > 100) {// 初期値は超えない
			throw new IllegalArgumentException("over max hp");
		}
		if(hp < 0) {// マイナスの値は入れない
			throw new IllegalArgumentException("under zero");
		}
		this.hp = hp;
	}


	/* 操作・メソッド */
	// キャラクターの固有メソッド
	
		// 攻撃1 なめる(相手に5のダメージを与える)
		public void attack(Character c) throws Exception {// キャラクタークラスを継承しているものすべてに適応
			// 内部処理
			int damage = 5;
			c.hp -= damage;
			// 出力処理
			String[] comment = {
				"マタンゴ" + this.suffix + "になめられた！",
				c.getName() + "に5のダメージ！",
				c.getName() + "のHPは残り" + c.getHp()
			};

			for(String c : comment) {
				System.out.println(c);

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
// 			for(String c : comment) {
// 				System.out.println(c);
// 				Thread.sleep(1000);
// 			}
// 		}
	
		// 攻撃3　毒攻撃（相手に10のダメージ、もしくはMP-2のダメージ。攻撃内容はランダムに決定。マタンゴ自身もHPを2使用する。)　

		public void poison(Character c) throws Exception {

			this.hp -= 2; //マタンゴ　HP-2
			int r = new java.util.Random().nextInt(5);
			if(r % 2 = 1) {
				int damege = 5;
				c.hp -= damege;
			}	else {
				int m_damage = 3;
				c.mp -= m_damage;
			}
			//出力処理
			String[] comment = {
				"マタンゴ" + this.suffix + "が毒を吐き出した！",
// 				c.getName() + "に10のダメージ"
			};

			for(String c : comment) {
				System.out.println(c);
				Thread.sleep(1000);
			}
		}

		// 攻撃4　大暴れ　敵全員に5のダメージ
		public void rampage(Character C) throws Exception {
			for(int i = 0; i < c.length; i++){
				c[i].setHp(c[i].getHp-5);
			}
		}

		// 逃げる
		public void run() {
			System.out.println("マタンゴ" + this.suffix + "は一目散に逃げ出した！");
		}

}
