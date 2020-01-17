package chapter15.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		double avg = 0.0;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			avg = avg + entry.getValue();
		}
		
		avg = avg / map.size();
		
		System.out.println("평균점수:" + avg);
		System.out.println("최고점수:" + maxScore);
		System.out.println("최고점수아이디: " + name);
	}
}









