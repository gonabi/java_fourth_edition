/*
HashMap을 이용해서 TreeMap생성
*/
package chap06;

import java.util.*;

public class TreeMapMain {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("나비1", new Integer(1));
		map.put("나비2", new Integer(2));
		map.put("나비3", new Integer(3));
		map.put("나비4", new Integer(4));
		map.put("나비5", new Integer(5));

		System.out.println("HashMap:"+map);
		
		Map<String,Integer> sortedMap = new TreeMap<String,Integer>();
		sortedMap.putAll(map);
		System.out.println("TreeMap:"+sortedMap);
	}

}

/*
HashMap:{나비5=5, 나비4=4, 나비1=1, 나비3=3, 나비2=2}
TreeMap:{나비1=1, 나비2=2, 나비3=3, 나비4=4, 나비5=5}
*/