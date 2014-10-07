import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache {

	
	protected static final int CACHE_MAX_SIZE = 3;

	public static void main(String args[])
	{
		
		LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String, Integer>(5, .75f, true) {
			
			@Override
			protected boolean removeEldestEntry(
					java.util.Map.Entry<String, Integer> eldest) {
				// TODO Auto-generated method stub
				 return  size() > CACHE_MAX_SIZE;
			}
		};
		
		linkedHashMap.put("one", 1);
		linkedHashMap.put("two", 2);
		linkedHashMap.put("three", 3);
		System.out.println(linkedHashMap);
		print(linkedHashMap);
		linkedHashMap.get("two");
		print(linkedHashMap);
		System.out.println(linkedHashMap);
	}

	private static void print(LinkedHashMap<String, Integer> linkedHashMap) {
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
