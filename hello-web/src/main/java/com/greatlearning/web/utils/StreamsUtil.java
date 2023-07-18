package com.greatlearning.web.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StreamsUtil {
	
	public static void main(String[] args) {
		Set<Integer> ids = new HashSet<>();
		ids.add(12);
		ids.add(13);
		ids.add(15);
		ids.add(16);
		ids.add(19);
		ids.add(22);
		ids.add(24);
		ids.add(26);
		
		//imperative
		Iterator<Integer> iterator = ids.iterator();
		while(iterator.hasNext()) {
			if(iterator.next() == 29) {
				System.out.println("Matched :: "+ 29);
			}
		}
		
		int match = ids.stream().filter(id -> id == 16).findFirst().get();
		System.out.println("matched :: "+ match);
	}

}
