public class Dragon extends Monster {
	// 属性・フィールド 
	private int hp;// 初期値
	final int MAX_hp=500;
	public Dragon(char suffix) {// コンストラクタ
		this.suffix = suffix;
	}
	// Monster.getNameのオーバーライド
	public String getName() {
		return "ドラゴン" + this.suffix;
	}
	// 操作・メソッド 
	// キャラクターの固有メソッド
		// 攻撃1 炎の息(10のダメージ)
		public void attack(Character c) throws Exception {// キャラクタークラスを継承しているものすべてに適応
			// 内部処理
			int damage = 10;
			c.hp -= damage;
			// 出力処理
			String[] comment = {
				"ドラゴン" + getName()+ "炎の息！",
				c.getName() + "に10のダメージ！",
				c.getName() + "のHPは残り" + c.getHp()
			};
            for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}
		// 攻撃2 噛みつき(20のダメージ)
		public void bite() throws Exception {
			//出力処理
			String[] comment = {
				"ドラゴン" + getName() + "が噛み付いた"
			};
			for(String cm : comment) {
				System.out.println(cm);
				Thread.sleep(1000);
			}
		}
		// 逃げる
		public void run() {
			System.out.println("ドラゴン" + getName() + "は逃げた");
		}

}
