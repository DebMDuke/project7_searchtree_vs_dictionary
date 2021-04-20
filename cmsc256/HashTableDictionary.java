package cmsc256;
/**
 *   CMSC 256
 *   Computer Science Department
 *   College of Engineering
 *   Virginia Commonwealth University
 */
import java.util.Map;
import java.util.Iterator;

/**
 *
 */
public class HashTableDictionary<K, V> implements Dictionary<K, V> {
	private MyHashTable<K, V> counts;

	public HashTableDictionary() {
		counts = new MyHashTable<K, V>();
	}

	@Override
	public V get(K key) {
		return counts.get(key);
	}

	@Override
	public void set(K key, V value) {
		counts.set(key, value);
	}
	
	public Iterator<Map.Entry<K, V>> iterator() {
		return counts.iterator();
	}
}
