public class Hero extends Character {
	//private String name; //名前
	private int hp; //HP
	final int MAX_HP = 300; //最大HP
	private int mp; //MP
	final int MAX_MP = 50; //最大MP

	public Hero() {
		this.setHp(300);
		this.setMp(50);
	}

	public void attack(monster m) {
		int damage = 10;
		m.setHp(m.getHp() - damage);
		System.out.println("勇者は" + damage + "のダメージを与えた。");
	} /*戦う*/
	
	public void aid(hero h) {
		h.hp += 10;
		this.mp -= 5;
		System.out.println(h.hp);
	} /*回復*/
	public void aid(wizard w) {
		w.hp += 10;
		this.mp -= 5;
		System.out.println(w.hp);
	} /*回復*/	

	public void thunder(monster m) {
		m.hp -= 30;
		this.mp -= 15;
		System.out.println(m.hp);
		System.out.println(h.mp);
	} /*雷斬り*/
}
