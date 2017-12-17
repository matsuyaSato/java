package java_rpg;

public class Main {
	public static void main(String[] args){
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		
		Hero h = new Hero("ミナト");		
		h.sword = s;
		
		Hero h1 = new Hero();
		
		SuperHero sh = new SuperHero();
		sh.setName("hero");
		sh.fly();
		sh.run();
		
		Dancer d = new Dancer();
		d.name = "ダンス";
		
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 80;
		m2.suffix = 'B';
		
		Wizard w = new Wizard();
		w.name = "菅原";
		w.hp = 50;
		w.heal(h);
		
		System.out.println("現在の武器は" + h.sword.name);
		d.attack(m1);
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		King king = new King();
		king.talk(h);
	}
}
