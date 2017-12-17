package java_rpg;

public class Hero {
	private String name;
	private int hp; //アクセス制御
	Sword sword;
	static int money;
	
	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した。");
	}
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った。");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、ころんだ!");
		System.out.println("5のダメージ!");
	}
	void run(){
		System.out.println(this.name + "は、逃げ出した!");
//		System.out.println("GAMEOVER");
//		System.out.println("最終HPは" + this.hp + "でした。");
	}
	public void attack(Matango m){
		System.out.println(this.name + "は攻撃した!");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた!");				
	}
	
	static void setRandomMoney(){
		Hero.money = (int)(Math.random() * 1000);
	}
	
	private void die(){
		System.out.println(this.name + "は死んでしまった。!");
		System.out.println("GameOverです。");
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("名前が入力されていません。");
		}
		if(name.length() <= 1){
			throw new IllegalArgumentException("名前が短すぎます。");
		}
		
		this.name = name;
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	//コンストラクタ
	Hero(String name){
		this.hp = 100;
		this.name = name;
		System.out.println("Heroのコンストラクタ");
	}
	Hero(){
		this("ダミー"); 
	}
	
}
