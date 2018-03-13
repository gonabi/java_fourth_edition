/*
HashSet을 이용해서 TreeSet생성
*/
package chap06;

import java.util.*;


public class TreeSetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add(new String("고나비1"));
		set.add(new String("고나비2"));
		set.add(new String("고나비3"));
		set.add(new String("고나비4"));
		set.add(new String("고나비5"));
		
		System.out.println("HashSet:"+set);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(set);
		System.out.println("TreeSet:"+ts);
		
	}

}

/*
HashSet:[고나비3, 고나비2, 고나비1, 고나비5, 고나비4]
TreeSet:[고나비1, 고나비2, 고나비3, 고나비4, 고나비5]
*/