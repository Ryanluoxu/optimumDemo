package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map interface we use for 'key' and 'value' pair
// A map cannot contain duplicate keys
// Maps are perfectly for key-value association mapping such as dictionaries. 
// Retrieve and update elements by keys, or perform lookups by keys.

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap();
		
		myMap.put("google", 11);
		myMap.put("twitter", 3);
		myMap.put("yahoo", 5);
		myMap.put("ebay", 10);
		myMap.put("alibaba", 7);

		System.out.println(myMap);	// {alibaba=7, twitter=3, yahoo=5, google=11, ebay=10}
		
		Set mySet = myMap.entrySet();
		System.out.println(mySet);	// [alibaba=7, twitter=3, yahoo=5, google=11, ebay=10]
		
		Iterator i = mySet.iterator();
		
		while (i.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)i.next();		// ???
			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
		}
		
		System.out.println(myMap.containsKey("abcd"));
		System.out.println(myMap.containsValue(10));
	}

}
