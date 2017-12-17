package java_rpg;

public class Wizard {
	String name;
	int hp;
	void heal(Hero h){
		h.setHp( h.getHp() + 10);
		System.out.println(h.getName() + "のHPを10回復した。");
	}
}
