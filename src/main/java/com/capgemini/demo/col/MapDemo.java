package com.capgemini.demo.col;

import java.util.HashMap;

public class MapDemo {
	// list,set,map,queue
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		System.out.println(hm);

		HashMap<String, String> stateCode = new HashMap<>();
		stateCode.put("MH", "Maharashtra");
		stateCode.put("TS", "Telangana");
		stateCode.put("KA", "Karnataka");
		System.out.println(stateCode);
		System.out.println(stateCode.get("TS"));
		System.out.println(stateCode.keySet());
		System.out.println(stateCode.values());

	}
}
