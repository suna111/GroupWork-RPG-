public class Slime extends Monster {
	/* 属性・フィールド */
	int hp = 10;// 初期値
	final int MAX_HP = 10;
	public Slime(char suffix) {// コンストラクタ
		this.suffix = suffix;
	}
	// Monster.getNameのオーバーライド
	public String getName() {
		return "スライム" + this.suffix;
	}
	/* 操作・メソッド */
	// キャラクターの固有メソッド
		// 攻撃1 ぷるぷる(3のダメージ)
		public void attack(Character c) throws Exception {// キャラクタークラスを継承しているものすべてに適応
			// 内部処理
			int damage = 3;
			c.setHp(c.getHp() - damage);
			// 出力処理
			String[] comment = {
				"スライム" + this.suffix + "のぷるぷる攻撃！",
				c.getName() + "に3のダメージ！",
				c.getName() + "のHPは残り" + c.getHp()
			};
			for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}
		// 攻撃(?)2 丸くなる(何も起こらない)
		public void crouch() throws Exception {
			//出力処理
			String[] comment = {
				"スライム" + this.suffix + "は丸くなった！",
				"しかし何も起こらなかった・・・"
			};
			for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}
		// 逃げる
		public void run() {
			System.out.println("スライム" + this.suffix + "はぷるぷる逃げ出した！");
		}

}
