package instance;
import java.util.*;

class Hero{
	public String name;
	public boolean equals(Object o){	
		if(this == o){ return true; }
		if( o instanceof Hero){
			Hero h = (Hero) o;
			if(this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args){
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		list.add(h1);
		h1.name = "みなと";
		System.out.println(list.size());
		h1 = new Hero();
		h1.name = "みなと";
		list.remove(h1);
		System.out.println(list.size());
	}
}
