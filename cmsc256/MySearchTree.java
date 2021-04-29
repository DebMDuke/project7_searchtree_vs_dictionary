package cmsc256;
/**
 *   CMSC 256
 *   Computer Science Department
 *   College of Engineering
 *   Virginia Commonwealth University
 */
import bridges.base.BSTElement;
import bridges.connect.Bridges;

import java.lang.Comparable;
import java.security.Key;
import java.util.Iterator;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Stack;

public class MySearchTree<K extends Comparable<? super K>, V> implements java.lang.Iterable<Map.Entry<K, V>> {
	private BSTElement<K, V> root;
	
	public MySearchTree(){
		root = null;
	}

	///TODO: Implement iterator logic for MySearchTree
	class SearchTreeIterator implements Iterator<Map.Entry<K, V>>  {

		SearchTreeIterator(BSTElement<K, V> node) {
		}

		public boolean hasNext() {
			return false;
		}

		public Map.Entry<K, V> next() {
			return  new AbstractMap.SimpleEntry<K, V> (null, null);
		}
	}

	public Iterator<Map.Entry<K, V>> iterator() {
		return new SearchTreeIterator(root);
	}

	//TODO: 
	public V get(K k) {
		return null;
	}

	//TODO: 
	public void set(K k, V e) {

	}

	///visualization function
	public void visualize (Bridges bridges) {
		if (root != null) {
			bridges.setDataStructure(root);
			try {
				bridges.visualize();
			} catch (Exception e) {
				System.err.println ("Exception :" + e.getMessage());
			}
		}
	}


}
