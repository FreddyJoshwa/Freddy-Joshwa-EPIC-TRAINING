package clg_placement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class hashmap_basics {

	public static void main(String[] args) {
//
//		HashMap<String, Integer> fruits=new HashMap<>();
//		HashMap<Float, Integer> wholenum=new HashMap<>();
//		HashMap<Character, Integer> alpha=new HashMap<>();
//
//		fruits.put("Apple", 100);
//		fruits.put("Banana", 200);
//
//		wholenum.put(2.7F, 3);
//		alpha.put('A', 1);
//		
//		System.out.println(fruits);
//		System.out.println(wholenum);
//		System.out.println(alpha);

//		String a="helloooo";
//		HashMap<Character,Integer> charc=new HashMap<>();
//		
//		for(int i=0;i<a.length();i++) {
//			if(charc.containsKey(a.charAt(i))){
//				int val=charc.get(a.charAt(i))+1;
//				charc.put(a.charAt(i), val);
//			}
//			else {
//				charc.put(a.charAt(i),1);
//			}
//		}
//		System.out.println(charc);
//	}
		Scanner obj=new Scanner(System.in);
	    ArrayList<Integer> arrlis=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> finset=new HashSet<>();


		System.out.println("Enter size : ");
		int n=obj.nextInt();
		System.out.println("Values : ");
		
		for(int i=0;i<n;i++) {
			arrlis.add(obj.nextInt());
		}

		for(int val:arrlis) {
			if(!set.add(val)) {
				finset.add(val);
			}
		}
		for(int val:finset) {
			set.removeAll(finset);
		}
	

		System.out.println(set);

	}
		
}
