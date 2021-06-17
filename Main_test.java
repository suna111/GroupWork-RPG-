public class Main_test {
	public static void main (String[] args) throws Exception {

//キャラクターを生成
Hero h = new Hero();
h.setName("勇者");
Fighter f = new Fighter("格闘家");
f.setName("格闘家");
f.setHp(350);
f.setMp(30);
Wizard w = new Wizard();

//モンスターを生成
Slime s = new Slime('A');
Matango ma = new Matango('A');
Dragon d = new Dragon('A');

//キャラクターの初期値確認
System.out.println("＜キャラクターの初期値確認＞");
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("FIGHTER:" + f.getName() + "/" + f.getHp() + "/" + f.getMp());
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("     ");

//モンスターの初期値確認
System.out.println("＜モンスターの初期値確認＞");
System.out.println("SLIME:" + s.getName() + "/" + s.getHp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("DRAGON" + d.getName() + "/" + d.getHp());
System.out.println("     ");

//Heroのメソッド確認
System.out.println("＜HEROのメソッド確認＞");

System.out.println("HEROのattack!-----10ダメージ");
h.attack(ma);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("HEROのaid!-----自分を10回復、MP5消費");
h.aid(h);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("HEROのthunder!-----30ダメージ、MP15消費");
h.thunder(ma);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("HEROのrun!-----逃げる");
h.run();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

//Fighterのメソッド確認
System.out.println("＜FIGHTERのメソッド確認＞");

ma.setHp(100);

System.out.println("FIGHTERのattack!-----5ダメージ * 1～1.9、瞑想中は2回攻撃");
f.attack(ma);
System.out.println("FIGHTER:" + f.getName() + "/" + f.getHp() + "/" + f.getMp() + "/" + f.getMdt());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("FIGHTERのmeditation!-----次の攻撃を2回攻撃にする、mdtを1足す");
f.meditation();
System.out.println("FIGHTER:" + f.getName() + "/" + f.getHp() + "/" + f.getMp() + "/" + f.getMdt());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");


System.out.println("FIGHTERのrun!-----逃げる");
f.run();
System.out.println("FIGHTER:" + f.getName() + "/" + f.getHp() + "/" + f.getMp() + "/" + f.getMdt());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

//Wizardのメソッド確認
System.out.println("＜WIZARDのメソッド確認＞");

ma.setHp(100);

System.out.println("WIZARDのattack!-----3～6ダメージ");
w.attack(ma);
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("WIZARDのfire!-----20ダメージ、MP10消費");
w.fire(ma);
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("WIZARDのbomb!-----残りMP分ダメージ、MPは0に");
w.bomb(ma);
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("WIZARDのrun!-----逃げる");
h.run();
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

//Slimeのメソッド確認
System.out.println("＜SLIMEのメソッド確認＞");

h.setHp(300);

System.out.println("SLIMEのattack!-----3ダメージ");
s.attack(h);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("SLIME:" + s.getName() + "/" + s.getHp());
System.out.println("     ");

System.out.println("SLIMEのcrouch!-----何も起こらない");
s.crouch();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("SLIME:" + s.getName() + "/" + s.getHp());
System.out.println("     ");

System.out.println("SLIMEのrun!-----逃げる");
s.run();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("SLIME:" + s.getName() + "/" + s.getHp());
System.out.println("     ");

//Matangoのメソッド確認
System.out.println("＜MATANGOのメソッド確認＞");

ma.setHp(100);
h.setHp(300);

System.out.println("MATANGOのattack!-----5ダメージ");
ma.attack(h);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("MATANGOのpoison!-----5ダメージ or 3MP消費、HPを2消費");
ma.poison(h);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("MATANGOのrampage!-----全員に5ダメージ");
ma.rampage(h, f, w);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("WIZARD:" + w.getName() + "/" + w.getHp() + "/" + w.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

System.out.println("MATANGOのrun!-----逃げる");
ma.run();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("MATANGO:" + ma.getName() + "/" + ma.getHp());
System.out.println("     ");

//Dragonのメソッド確認
System.out.println("＜DRAGONのメソッド確認＞");
h.setHp(300);

System.out.println("DRAGONのattack!-----10ダメージ");
d.attack(h);
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("DRAGON" + d.getName() + "/" + d.getHp());
System.out.println("     ");

System.out.println("DRAGONのbite!-----何も起こらない");
d.bite();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("DRAGON" + d.getName() + "/" + d.getHp());
System.out.println("     ");

System.out.println("DRAGONのrun!-----逃げる");
d.run();
System.out.println("HERO:" + h.getName() + "/" + h.getHp() + "/" + h.getMp());
System.out.println("DRAGON" + d.getName() + "/" + d.getHp());
System.out.println("     ");

	}
}