package learncollection;

import java.util.TreeMap;

public class MapExample4 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String >map=
				new TreeMap<Integer, String>();
		
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "B");
		map.put(104, "C");
		map.put(105, "D");
		
		System.out.println(map);
		
		System.out.println("------------------------------------------");
		System.out.println(map.keySet());
		System.out.println(map.higherKey(102));
		System.out.println(map.higherEntry(102));
		
		System.out.println("------------------------------------------");
		System.out.println(map.keySet());
		System.out.println(map.lowerEntry(105));
		System.out.println(map.lowerKey(104));
		
		System.out.println("------------------------------------------");
		
		System.out.println(map.ceilingKey(105));
		System.out.println(map.ceilingEntry(103));
		
		System.out.println("------------------------------------------");
		System.out.println(map.floorKey(203));
		System.out.println(map.floorEntry(204));
		
		System.out.println("------------------------------------------");
		
		System.out.println(map.headMap(104));
		System.out.println(map.headMap(105,true));
		
		System.out.println("-------------------------------------------");
		
		System.out.println(map.tailMap(102));
		System.out.println(map.tailMap(102,false));
		System.out.println("------------------------------------------");
		
		System.out.println(map.subMap(102,true, 500, true));
		System.out.println("------------------------------------------");
		
		System.out.println(map.firstEntry());// first Entry mean you will get first elements
		System.out.println(map.firstKey());
		
		System.out.println(map.pollFirstEntry());
		System.out.println(map);
		System.out.println(map.pollLastEntry());
		System.out.println(map);
		
		
		


		
		
		
		
		
	}


}
