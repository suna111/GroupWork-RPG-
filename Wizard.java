public class Wizard extends Character{
//属性・フィールド
	//String nameはCharacterから継承
	final int MAX_HP = 100;//最大HP、定数
	int hp = 100;//HP、初期値を設定
	final int MAX_MP = 80;//最大MP、定数
	int mp = 80;//MP、初期値を設定

//操作・メソッド
//getterとsetter

//String name
	//名前を取得する（getter）
	public String getName() {
		return this.name;
	}
	//名前を設定する（setter）
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("null");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("short");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("long");
		}
		this.name = name;
	}

//final int MAX_HP
	//最大HPを取得する（getter）定数なのでsetterは不要
	public int getMaxhp() {
		return this.MAX_HP;
	}

//int hp
	//HPを取得する（getter）
	public int getHp() {
		return this.hp;
	}
	//HPを設定する（setter）
	public void setHp(int hp) {
		if (hp > MAX_HP) {//最大HPを超える数値は設定できない
			throw new IllegalArgumentException ("over MAX_HP");
		}
		if (hp < 0) {//負の数値は設定できない
			throw new IllegalArgumentException ("under zero");
		}
		this.hp = hp;
	}

//final int MAX_MP
	//最大MPを取得する（getter）定数なのでsetterは不要
	public int getMaxmp() {
		return this.MAX_MP;
	}

//int mp
	//MPを取得する（getter）
	public int getMp() {
		return this.mp;
	}
	//MPを設定する（setter）
	public void setMp(int mp) {
		if (mp > MAX_MP) {//最大MPを超える数値は設定できない
			throw new IllegalArgumentException ("over MAX_MP");
		}
		if (mp < 0) {//負の数値は設定できない
			throw new IllegalArgumentException ("under zero");
		}
		this.mp = mp;

	}

//キャラクターの固有メソッド
	//通常攻撃　杖で殴る（3～6のダメージ、消費MP0）
	 public void attack(Monster m)  throws Exception{//モンスタークラスを継承しているものすべてに適応
		//内部処理
	 	int damage = 3 + (new java.util.Random().nextInt(4)); //3～6のダメージ
	 	int mHp = m.getHp();//getterを使うために変数に代入
	 	mHp -= damage; //敵のHPからダメージ分を引いて代入
	 	m.setHp(mHp);//setterで残り体力を代入

	 	//出力処理
	 	String [] comment = {//配列に入れる
	 			this.getName() + "は杖で殴りつけた！",
	 			m.getName() + "に" + damage + "のダメージ！",
	 			m.getName() + "は余裕そうに笑っている",
	 			m.getName() + "のHPは残り" + m.getHp()//テスト用
	 	};

	 	for(String c : comment) {//繰り返し出力処理
	 		System.out.println(c);
	 		Thread.sleep(1000);//1秒ごとに出力
	 	}
	 }

	 //炎魔法　炎で焼き尽くす（20のダメージ、消費MP10）
	 public void fire(Monster m) throws Exception {
		//内部処理
		if (this.getMp() >= 10) {//MPが10以上あったら魔法を放つ
		 	int damage = 20; //固定ダメージ20
		 	int mHp = m.getHp();//getterを使うために変数に代入
		 	mHp -= damage; //敵のHPからダメージ分を引いて代入
		 	m.setHp(mHp);//setterで残り体力を代入
			int wMp = this.getMp();//getterを使うために変数に代入
			wMp -= 10; //MPを10消費
			this.setMp(wMp);//setterで残りMPを代入

		 	//出力処理
		 	String [] comment = {//配列に入れる
		 			this.getName() + "は炎魔法を放った！",
		 			"MPが10減った",
		 			m.getName() + "に" + damage + "のダメージ！",
		 			m.getName() + "は熱そうにしている",
		 			m.getName() + "のHPは残り" + m.getHp()//テスト用
		 	};

		 	for(String c : comment) {//繰り返し出力処理
		 		System.out.println(c);
		 		Thread.sleep(1000);//1秒ごとに出力
		 	}
		} else {//MPが10以下の場合何もしない
			System.out.println("MPが足りない！");
		}

	 }

	 //自暴自棄　爆発する（消費MP分のダメージ、消費MPは残りすべて）
	 public void bomb(Monster m) throws Exception {
		//内部処理
		if (this.getMp() > 0) {//MPが0以上ある場合実行する
			int damage = this.getMp(); //残りMP分のダメージ
		 	int mHp = m.getHp();//getterを使うために変数に代入
		 	mHp -= damage; //敵のHPからダメージ分を引いて代入
		 	m.setHp(mHp);//setterで残り体力を代入
			int wMp = this.getMp();//getterを使うために変数に代入
			wMp = 0; //MPを0にする
			this.setMp(wMp);//setterで残りMPを代入

			String [] comment = {//配列に入れる
					this.getName() + "は自暴自棄になった！",
					m.getName() + "に" + damage + "のダメージ！",
					this.getName() + "のMPは" + this.getMp() + "になった！",
					m.getName() + "は唖然としている",
					m.getName() + "のHPは残り" + m.getHp()//テスト用
			};

			for(String c : comment) {//繰り返し出力処理
		 		System.out.println(c);
		 		Thread.sleep(1000);//1秒ごとに出力
		 	}
		 } else {//MPが0の場合何もしない
			 System.out.println("もうMPは残っていない！");
		 }
	 }


}
