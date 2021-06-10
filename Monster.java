public abstract class Monster {
	/* 属性・フィールド */
	char suffix;
	int hp;
	// 名前を取得する(getter)
	// インスタンス作成時にsuffixを設定しているのでsetterはなし
	public abstract String getName();
	// HPを取得する(getter)
	public int getHp() {
		return this.hp;
	}
	// HPを設定する(setter)
	public void setHp(int hp) {
		if(hp > 10) {// 初期値は超えない
			throw new IllegalArgumentException("over max hp");
		}
		this.hp = hp;
	}

	/* 操作・メソッド */
	// Characterクラスを継承しているクラスに対して攻撃
	public abstract void attack(Character c) throws Exception;
	public abstract void run();
}
