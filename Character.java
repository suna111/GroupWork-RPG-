public abstract class Character {
	
	int hp; //HP
	int mp; //MP
	
	public int getHp() {
		return this.hp;
	} //getter
	public void setHp(int hp) {
		this.hp = hp;
	} //setter
	
	public int getMp() {
		return this.mp;
	} //getter
	public void setMp(int mp) {
		this.mp = mp;
	} //setter
	
	public abstract run() {"GAME OVER"}; //逃げる "GAME OVER"は仮
}
