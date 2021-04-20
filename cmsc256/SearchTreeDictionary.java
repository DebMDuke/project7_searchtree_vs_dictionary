package cmsc256;
/**
 *   CMSC 256
 *   Computer Science Department
 *   College of Engineering
 *   Virginia Commonwealth University
 */
import java.util.Map;
import java.util.Iterator;


public class SearchTreeDictionary<K extends Comparable<? super K>, V> implements Dictionary<K, V> {
	private MySearchTree<K, V> counts;

	public SearchTreeDictionary() {
		counts = new MySearchTree<K, V>();
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
