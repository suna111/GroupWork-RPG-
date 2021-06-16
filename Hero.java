public class Hero extends Character {
	String name;
	int hp = 300;
	final int MAX_HP = 300;
	int mp = 50;
	final int MAX_MP = 50;
	public void Attack(Monster m) {
		m.hp -= 10;
	}
}
