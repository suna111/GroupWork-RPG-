public class Wizard extends Character{
	//属性・フィールド
	final int MAX_HP = 100;
	int hp = 100;//初期値
	final int MAX_MP = 80;
	int mp = 80;//初期値

	//操作・メソッド
	//名前を取得する（getter）
	public String getName() {
		return this.name;
	}

	//名前を設定する（setter）
	public void setName(String name) {
		this.name = name;
	}

	//通常攻撃　杖で殴る（3～6のダメージ、消費MP0）
	 public void attack(Monster m) {//モンスタークラスを継承しているものすべてに適応
		 //内部処理
	 	int damage = 3 + (new java.util.Random().nextInt(4)); //3～6のダメージ
	 	m.hp -= damage; //敵のHPからダメージ分を引いて代入

	 	//出力処理
	 	String [] comment = {//配列に入れる
	 			this.name + "は杖で殴りつけた！",
	 			m.name + "に" + damage + "のダメージ！",
	 			m.name + "は余裕そうに笑っている",
	 			m.name + "のHPは残り" + m.hp
	 	};

	 	for(String c : comment) {//繰り返し出力処理
	 		System.out.println(c);
	 	}
	 }

	 //炎魔法　炎で焼き尽くす（20のダメージ、消費MP10）
	 public void fire(Monster m) {
		 //内部処理
		if (this.mp >= 10) {//MPが10以上あったら魔法を放つ
	 	int damage = 20; //固定ダメージ20
	 	m.hp -= damage; //敵のHPからダメージ分を引いて代入
	 	this.mp -= 10; //MPを10消費

	 	//出力処理
	 	String [] comment = {//配列に入れる
	 			this.name + "は炎魔法を放った！",
	 			"MPが10減った",
	 			m.name + "に" + damage + "のダメージ！",
	 			m.name + "は熱そうにしている",
	 			m.name + "のHPは残り" + m.hp
	 	};

	 	for(String c : comment) {//繰り返し出力処理
	 		System.out.println(c);
	 	}
		} else {//MPが10以下の場合何もしない
			System.out.println("MPが足りない！");
		}

	 }

	 //自暴自棄　爆発する（消費MP分のダメージ、消費MPは残りすべて）
	 public void bomb(Monster m) {
		 //内部処理
		if (this.mp > 0) {//MPが0以上ある場合実行する
		int damage = this.mp; //残りMP分のダメージ
		m.hp -= damage; //敵のHPからダメージ分を引いて代入
		this.mp = 0; //MPを0にする

		String [] comment = {//配列に入れる
				this.name + "は自暴自棄になった！",
				m.name + "に" + damage + "のダメージ！",
				this.name + "のMPは" + this.mp + "になった！",
				m.name + "は唖然としている",
				m.name + "のHPは残り" + m.hp
		};

		for(String c : comment) {//繰り返し出力処理
	 		System.out.println(c);
	 	}
	 } else {//MPが0の場合何もしない
		 System.out.println("もうMPは残っていない！");
	 }
	 }
}
