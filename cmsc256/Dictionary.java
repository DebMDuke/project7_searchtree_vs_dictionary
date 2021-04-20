package cmsc256;
/**
 *   CMSC 256
 *   Computer Science Department
 *   College of Engineering
 *   Virginia Commonwealth University
 */
import java.util.Map;

public interface Dictionary<K, V> extends Iterable<Map.Entry<K,V>> {
	/**
	 * Returns the node at key
	 * @param key key of node to get
	 * @return value
	 */
	public V get(K key);

	/**
	 * sets the value of node at key with value
	 * @param key key of node to be set
	 * @param value new value of node
	 */
	public void set(K key, V value);
}
