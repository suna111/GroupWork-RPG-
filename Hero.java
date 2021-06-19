public class Hero extends Character {
	//private String name; //名前
	private int hp; //HP
	final int MAX_HP = 300; //最大HP
	private int mp; //MP
	final int MAX_MP = 50; //最大MP

	// 引数(名前入力)有のコンストラクタ
	public Hero(String name) {
		this.setHp(300);
		this.setMp(50);
		this.setName(name);
	}
	// 引数無のコンストラクタ
	public Hero() {
		this.setHp(300);
		this.setMp(50);
		this.setName("仮の名前");
	}

	// 戦う
	public void attack(Monster m) {
		int damage = 20;
		m.setHp(m.getHp() - damage);
		System.out.println("勇者は" + m.getName() + "に" + damage + "のダメージを与えた。");
	}
	
	// 回復
	public void aid(Character c) {
		int recovery = 20;
		c.setHp(c.getHp() + recovery);
		this.setMp(this.getMp() - 5);
		System.out.println(c.getName() + "のHPが" + recovery + "回復した。");
	}
	
	//雷斬り
	public void thunder(Monster m) {
		int damage = 50;
		m.setHp(m.getHp() - damage);
		this.setMp(this.getMp() - 15);
		System.out.println("勇者は" + m.getName() + "に" + damage + "のダメージを与えた。");
		//System.out.println(h.mp);
	} 
}
