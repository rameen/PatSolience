import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


 public class LinkedHashMapExample { 

      private final static int CACHE_MAX_SIZE = 100; 
      private LinkedHashMap<String, Integer>cache;

      public LinkedHashMapExample() { 

           this.cache = new LinkedHashMap<String, Integer>(CACHE_MAX_SIZE, 0.75f, true) { 
                  protected boolean removeEldestEntry(
                             Map.Entry<String, Integer> eldest) {
                        // Remove the eldest entry if the size of the cache exceeds the
                        // maximum size
                        return size() < CACHE_MAX_SIZE;
                  }
            };
      } 
      
      public void put(String key , Integer value)
      {
    	  this.cache.put(key, value);
      }
      
      public void get(String key)
      {
    	  this.get(key);
      }
      public Integer getIdForName(String name) {
             Integer id = cache.get(name);

             if (id != null)
                  return id;
            else {
                  id = getIdForNameFromExternal(name);
                   // TODO Tino, 24.06.2009: what to do if no id could be found for the
                  // provided name in external resource?
                  cache.put(name, id);
                  return id;
            }
      }

      public void print()
      {
    	  for (Map.Entry<String, Integer> entry : cache.entrySet()) {
    		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    		}
      }
      private Integer getIdForNameFromExternal(String name) {
             // TODO Tino, 24.06.2009: replace dummy-code
            return 1;
      }
      
      public static void main(String args[])
      {
    	  LinkedHashMapExample example = new LinkedHashMapExample();
    	  
    	  System.out.println("sss");
    	  example.put("1",1);
    	  example.put("2",2);
    	  example.put("3",3);
    	  example.print();
    	  System.out.println("sss");
    	  
    	  
    	  
      }
}