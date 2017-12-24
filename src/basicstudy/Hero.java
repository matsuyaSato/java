package basicstudy;

public class Hero implements Cloneable{
	String name;
	int hp;
	
	public Hero clone(){
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		return result; 
	}
	
	Hero(String name){
		this.name = name;
	}
	
	Hero(){
		
	}
}
