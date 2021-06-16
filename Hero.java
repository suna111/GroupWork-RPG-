public class Hero {
		private String name; //名前
	private int hp; //HP
	final int MAX_HP = 300; //最大HP
	private int mp; //MP
	final int MAX_MP = 50; //最大MP

	public String getName() {
		return this.name;
	} /*名前のgetter*/
	public void setName(String name) {
		this.name = name;
	} /*名前のsetter*/

	public Hero() {
		this.setHp(300);
		this.setMp(50);
	}　/*コンストラクタ*/

	public void Attack(Monster m) {
		m.hp -= 10;
	} /*戦う*/
	
	public void Aid(Heroh h) {
		h.hp += 10;
		this.mp -= 5;
		System.out.println(h.hp);
	} /*回復*/
	
	public void Thunder(Monster m) {
		m.hp -= 30;
		this.mp -= 15;
	} /*雷斬り*/
}
