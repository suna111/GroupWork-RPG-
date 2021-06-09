public class Slime extends Monster {
	/* 属性・フィールド */
	int hp = 10;// 初期値
	public Slime(char suffix) {// コンストラクタ
		this.suffix = suffix;
	}

	// 名前を取得する(getter)
	// インスタンス作成時にsuffixを設定しているのでsetterはなし
	public String getName() {
		return "スライム" + this.suffix;
	}
	// HPを取得する(getter)
	public int getHp() {
		return this.hp;
	}
	// HPを設定する(setter)
	public void setHP(int hp) {
		if(hp > 10) {// 初期値は超えない
			throw new IllegalArgumentException("over max hp");
		}
		if(hp < 0) {// マイナスの値は入れない
			throw new IllegalArgumentException("under zero")
		}
		this.hp = hp;
	}

	/* 操作・メソッド */
	// キャラクターの固有メソッド
		// 攻撃1 ぷるぷる(3のダメージ)
		public void attack(Character c) throws Exception {// キャラクタークラスを継承しているものすべてに適応
			// 内部処理
			int damage = 3;
			c.hp -= damage;
			// 出力処理
			String[] comment = {
				"スライム" + this.suffix + "のぷるぷる攻撃！",
				c.getName() + "に3のダメージ！",
				c.getName() + "のHPは残り" + c.getHp()
			};
			for(String c : comment) {
				System.out.println(c);
				Thread.sleep(1000);
			}
		}
		// 攻撃(?)2 丸くなる(何も起こらない)
		public void crouch() {
			//出力処理
			String[] comment = {
				"スライム" + this.suffix + "は丸くなった！",
				"しかし何も起こらなかった・・・"
			};
			for(String c : comment) {
				System.out.println(c);
				Thread.sleep(1000);
			}
		}
		// 逃げる
		public void run() {
			System.out.printn("スライム" + this.suffix + "はぷるぷる逃げ出した！");
		}

}
