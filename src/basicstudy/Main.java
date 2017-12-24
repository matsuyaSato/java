package basicstudy;
import static basicstudy.AccountType.FUTSU;

public class Main {
	public static void main(String[] args){
		Hero h1 = new Hero("minato");
		Hero h2 = h1.clone();
		System.out.println(h1.name);
		h2.name="test";
		System.out.println(h1.name);
		System.out.println(h2.name);
		
		Pocket<String> p = new Pocket<String>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
		
		Account a = new Account("11111", FUTSU);
		System.out.println(a);
	}

}
