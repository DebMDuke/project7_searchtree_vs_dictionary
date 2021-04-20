package cmsc256;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class StandardDictionary<K, V> implements Dictionary<K, V> {
	private HashMap<K, V> counts;

	public StandardDictionary() {
		counts = new HashMap<K, V>();
	}

	@Override
	public V get(K key) {
		return counts.get(key);
	}

	@Override
	public void set(K key, V value) {
		counts.put(key, value);
	}

	public Iterator<Map.Entry<K, V>> iterator() {
		return counts.entrySet().iterator();
	}
}
