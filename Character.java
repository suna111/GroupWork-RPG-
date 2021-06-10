public abstract class Character {
	
	int hp; //HP
	int MAX_HP; //最大HP
	int mp; //MP
	int MAX_MP; //最大MP
	
	public String getName(); {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract run(); //逃げる
}
