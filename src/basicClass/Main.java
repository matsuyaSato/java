package basicClass;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {
	public static void main(String[] args){
		Date now = new Date();
		SimpleDateFormat f =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String s = f.format(now);
		System.out.println(s);
	}
}
