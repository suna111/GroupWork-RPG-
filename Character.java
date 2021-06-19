public abstract class Character {
	
	String name; //名前
	int hp; //HP
	int mp; //MP
	
	public String getName() {
		return this.name;
	} //getter 名前
	public void setHp(String name) {
		this.name = name;
	} //setter 名前
	
	public int getHp() {
		return this.hp;
	} //getter HP
	public void setHp(int hp) {
		this.hp = hp;
	} //setter HP
	
	public int getMp() {
		return this.mp;
	} //getter MP
	public void setMp(int mp) {
		this.mp = mp;
	} //setter MP
	
	public void run() {
		System.out.println("GAME OVER");
	} //逃げる "GAME OVER"は仮
}
