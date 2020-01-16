package chapter15.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(2, 3);
		map.put(3, 4);
		map.put(0, 3);
		System.out.println(map.size());
		
		System.out.println(map.get(0));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(1));
		
		
	}
}

















