import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo {

    public static void main(String args[]){
        LRUCache<Integer, Integer> cache = new LRUCache<Integer, Integer> (2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache);
        cache.get(1);
        cache.put(3,3);

        System.out.println(cache);
    }
}

class LRUCache<K,V> extends LinkedHashMap<K, V> {
    int capacity;

    public LRUCache(int capacity){
        super(capacity,1.5F,true);
        this.capacity =capacity;
    }

    public V get(Object key) {
        return super.get(key);
    }

    public V put(K key, V value){
        return super.put(key,value);

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()> capacity;
    }
}
