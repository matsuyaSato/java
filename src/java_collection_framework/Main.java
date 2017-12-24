package java_collection_framework;

import java.util.*;


public class Main {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("たなか");
		names.add("すずき");
		System.out.println(names.get(1));
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		for(int i : points){
			System.out.println(i);
		}
		
		
		//iterator
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.println(e);
		}
		
		//LinkedHashSet
		Set<String> words = new LinkedHashSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		
		for(String i : words){
			System.out.println(i);
		}	
		
		//Map
		Map<String,Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都", 255);
		prefs.put("東京都", 1261);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo);
		for(String key: prefs.keySet()){
			int value = prefs.get(key);
			System.out.println( key + "の人口は、" + value);
		}						
	}
}
