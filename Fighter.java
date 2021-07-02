public class Fighter extends Character {
	//フィールド
	private String name;
	private int hp;
	final int MAX_HP = 350;
	private int mp;
	final int MAX_MP = 30;
	private int mdt = 0;//瞑想メソッドのカウント

	//コンストラクタ
	public Fighter(String name) {//nameを引数に取る
		this.setHp(350);
		this.setMp(30);
		this.setName(name);
	}
	public Fighter() {//引数なし
		this.setHp(350);
		this.setMp(30);
		this.setName("アセロラ");
	}

	//Fighter特有のgetterとsetter
	public int getMdt() {
		return mdt;
	}

	public void setMdt(int mdt) {
		this.mdt = mdt;
	}

	//getter
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public String getName() {
		return this.name;
	}

	//setter
	public void setHp(int hp) {
		//MAXHPは超えない
		if(hp > this.MAX_HP) {
			this.hp = this.MAX_HP;
		}
		//HPが0になった際の処理
		if(hp <= 0) {
			this.hp = 0;
			String [] comment = {
				this.getName() + "のHPが0になってしまった！",
				this.getName() + "は戦線を離脱した"
			};
			for(String c : comment) {
				System.out.println(c);
			}
		}
		this.hp = hp;
		}


	public void setMp(int mp) {
		if(mp > MAX_MP) {
			this.mp= MAX_MP;
		}
		if(mp <= 0) {
			this.mp = 0;
		}
		this.mp = mp;
		}


	public void setName(String name)  {
		if(name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎます。2文字以上で入力してください。");
		}
		if(name.length() >= 9) {
			throw new IllegalArgumentException
			("名前が長すぎます。8文字以内で入力してください。");
		}
		this.name = name;
	}

	//メソッド
	// 戦う：attack　敵を力一杯蹴る（5のダメージ　×　1〜1.9倍のランダム修正）
	// 瞑想：meditation　精神を集中させ、次のattackを2回行う 1.2倍修正

	public void attack(Monster m) {
		if(mdt >= 1) {//瞑想カウントが1以上ある場合の攻撃
			//1回目攻撃処理
			int dmg1 = (int)(5 * (new java.util.Random().nextDouble() + 1));
			dmg1 *= 1.2;//瞑想メソッドによるダメージ修正
			m.setHp(m.getHp() - dmg1);
			//2回目攻撃処理
			int dmg2 = (int)(5 * (new java.util.Random().nextDouble() + 1));
			dmg2 *= 1.2;//瞑想メソッドによるダメージ修正
			m.setHp(m.getHp() - dmg2);
			mdt = 0;//瞑想カウントを0に戻す

			String [] comment = {
				this.getName() + "の攻撃！",
				m.getName() + "に" + dmg1 + "のダメージ！",
				this.getName() + "の2回目の攻撃！",
				m.getName() + "に" + dmg2 + "のダメージ！"
			};
			for(String c : comment) {
				System.out.println(c);
			}

		} else {//通常攻撃
			int dmg = (int)(5 * (new java.util.Random().nextDouble() + 1));
			m.setHp(m.getHp() - dmg);

			String [] comment = {
				this.getName() + "の攻撃！",
				m.getName() + "に" + dmg + "のダメージ！"
			};
			for(String c : comment) {
				System.out.println(c);
			}

		}
	}

	public void meditation() {
		mdt++;
		System.out.println(this.getName() + "は精神を集中させ、次の攻撃に備えた！");
	}

	public void run() {
		System.out.println(this.getName() + "は一目散に逃げ出した！");
	}



}
