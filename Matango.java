public class Matango extends Monster {
	/* 属性・フィールド */
	int hp = 30;// 初期値
	public Matango(char suffix) {// コンストラクタ
		this.suffix = suffix;
	}

	// 名前を取得する(getter)
	// インスタンス作成時にsuffixを設定しているのでsetterはなし
	public String getName() {
		return "マタンゴ" + this.suffix;
	}
	// HPを取得する(getter)
	public int getHp() {
		return this.hp;
	}
	// HPを設定する(setter)
	public void setHP(int hp) {
		if(hp > ) {// 初期値は超えない
			throw new IllegalArgumentException("over max hp");
		}
		if(hp < 0) {// マイナスの値は入れない
			throw new IllegalArgumentException("under zero")
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
	
		// 攻撃2　羽交い絞め（相手・装備の動作を1回止める)
		public void hold(Character c) throws Exception {
			//出力処理
// 			String[] comment = {
// 				"マタンゴ" + this.suffix + "の羽交い絞め！",
// 				c.getName() + "は身動きが取れない・・・！"
// 			};
			for(String c : comment) {
				System.out.println(c);
				Thread.sleep(1000);
			}
		}
	
		// 攻撃3　毒攻撃（相手に10のダメージ、もしくは相手のMPを3減らす。攻撃内容はランダムに決定。マタンゴ自身もHPを2使用する。)
		public void poison(Character c) throws Exception {
			//出力処理
			String[] comment = {
				"マタンゴ" + this.suffix + "が毒を吐き出した！",
// 				c.getName() + "に10のダメージ"
// 			};
			for(String c : comment) {
				System.out.println(c);
				Thread.sleep(1000);
			}
		}
		// 逃げる
		public void run() {
			System.out.printn("マタンゴ" + this.suffix + "は一目散に逃げ出した！");
		}

}
