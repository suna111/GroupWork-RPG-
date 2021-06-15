public class Wizard extends Character{
//属性・フィールド
	private String name;
	private final int MAX_HP = 100;//最大HP、定数
	private int hp;//HP、初期値を設定
	private final int MAX_MP = 80;//最大MP、定数
	private int mp;//MP、初期値を設定

//コンストラクタ
	public Wizard(String name) {//名前を引数に取る
		this.setName("魔法使い " + name);
		this.setHp(100);
		this.setMp(80);
	}
	public Wizard() {//引数なしでも誕生出来る
		this.setName("魔法使い マジカル");
		this.setHp(100);
		this.setMp(80);
	}

//操作・メソッド

//キャラクターの固有メソッド
	//通常攻撃　杖で殴る（3～6のダメージ、消費MP0）
	 public void attack(Monster m)  throws Exception{//モンスタークラスを継承しているものすべてに適応
		//内部処理
	 	int damage = 3 + (new java.util.Random().nextInt(4)); //3～6のダメージ
	 	m.setHp(m.getHp() - damage);//ダメージを受けた後のHPを設定

	 	//出力処理
	 	String [] comment = {//配列に入れる
	 			this.getName() + "は杖で殴りつけた！",
	 			m.getName() + "に" + damage + "のダメージ！",
	 			m.getName() + "は余裕そうに笑っている",
	 			m.getName() + "のHPは残り" + m.getHp()//テスト用
	 	};

	 	for(String cm : comment) {//繰り返し出力処理
	 		System.out.println(cm);
	 		Thread.sleep(1000);//1秒ごとに出力
	 	}
	 }

	 //炎魔法　炎で焼き尽くす（20のダメージ、消費MP10）
	 public void fire(Monster m) throws Exception {
		//内部処理
		if (this.getMp() >= 10) {//MPが10以上あったら魔法を放つ
		 	int damage = 20; //固定ダメージ20
		 	m.setHp(m.getHp() - damage);//ダメージを受けた後のHPを設定
		 	this.setMp(this.getMp() - 10);//消費後のMPを設定

		 	//出力処理
		 	String [] comment = {//配列に入れる
		 			this.getName() + "は炎魔法を放った！",
		 			"MPが10減った",
		 			m.getName() + "に" + damage + "のダメージ！",
		 			m.getName() + "は熱そうにしている",
		 			m.getName() + "のHPは残り" + m.getHp()//テスト用
		 	};

		 	for(String cm : comment) {//繰り返し出力処理
		 		System.out.println(cm);
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
			m.setHp(m.getHp() - damage);//ダメージを受けたあとのHPを設定
			this.setMp(0);//MPを0に設定

			//出力処理
			String [] comment = {//配列に入れる
					this.getName() + "は自暴自棄になった！",
					m.getName() + "に" + damage + "のダメージ！",
					this.getName() + "のMPは" + this.getMp() + "になった！",
					m.getName() + "は唖然としている",
					m.getName() + "のHPは残り" + m.getHp()//テスト用
			};

			for(String cm : comment) {//繰り返し出力処理
		 		System.out.println(cm);
		 		Thread.sleep(1000);//1秒ごとに出力
		 	}
		 } else {//MPが0の場合何もしない
			 System.out.println("もうMPは残っていない！");
		 }
	 }

//	 public void phantom(Monster m) throws Exception{//一定ターン数行動不能にする
//		 //内部処理
//		 m.setVind(2);//行動不能ターン数を２に設定
//
//		 //出力処理
//		 String [] comment = {
//			this.getName() + "は幻を生み出した！",
//			"幻の猫は"+ m.getName() + "にごろごろ擦り寄った！",
//			m.getName() + "は幻の猫に夢中になってしまった・・・",
//			"もはや攻撃どころではない！"
//		 };
//		 for (String cm : comment) {
//			 System.out.println(cm);
//			 Thread.sleep(1000);
//		 }
//	 }

	 public void run() throws Exception {
		 //内部処理

		 //出力処理
		 String [] comment = {
				 this.getName() + "は杖を投げ捨てて逃げた！"
		 };

		 for(String cm : comment) {
			 System.out.println(cm);
		 }
	 }


}
