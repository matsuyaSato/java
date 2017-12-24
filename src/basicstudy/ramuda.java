package basicstudy;

import java.util.*;
import java.util.function.*;
public class ramuda {
	public static void main(String[] args){
		double b = 1.41;
		IntToDoubleFunction func = (x) -> {
			return x* x * b;
		};
		System.out.println(func);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(Integer i : list1){
			i = i+2;
		}
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		while(i.hasNext()){
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		final String BR = System.getProperty("line.separator");
		System.out.println("本日は" + BR + "晴天");
	}
}
