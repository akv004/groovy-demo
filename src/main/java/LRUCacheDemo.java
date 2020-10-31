
import java.util.HashMap;
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


        /// using DLinkNode

        LRU  lru = new LRU (2);
        lru.put(1,1);
        lru.put(2,2);
        System.out.println(lru);
        lru.get(1);
        lru.put(3,3);
        System.out.println(lru);


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
//Implement by HashMap and DoublyLinkedList
class LRU {
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre,post;
    }

    DLinkedNode head;
    DLinkedNode tail;
    Map<Integer, DLinkedNode> cache;
    int count;
    int capacity;

    LRU(int capacity){
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.post = tail;
        tail.pre = head;
        this.capacity = capacity;
        cache = new HashMap<Integer, DLinkedNode>();
    }

    // Always add new node after head.
    private void addNode(DLinkedNode node){
      node.pre = head;
      node.post = head.post;

      head.post.pre = node;
      head.post = node;
    }

    // remove an exiting node from linked list
    private void removeNode(DLinkedNode node){
     DLinkedNode pre = node.pre;
     DLinkedNode post = node.post;
     pre.post = post;
     post.pre = pre;

    }
    private void moveToHead(DLinkedNode node){
        addNode(node);
       removeNode(node);

    }

    //pop tail
    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }

    int get(Integer key){
        DLinkedNode node = cache.get(key);
        if(node ==null){
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    void put(int key, int value){
        DLinkedNode node = cache.get(key);
        if(node ==null) {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            this.moveToHead(newNode);
            addNode(newNode);
            count++;
            if (cache.size() > capacity) {
                cache.remove(popTail());
                count--;
            }
        }else{
            node.value = value;
            //cache.put(key,node);
            moveToHead(node);
        }
    }


}
