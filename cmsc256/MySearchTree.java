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


public class MySearchTree<K extends Comparable<? super K>, V>  {
	private BSTElement<K, V> root;
	
	public MySearchTree(){
		root = null;
	}

	///TODO: Implement iterator logic for MySearchTree
	class SearchTreeIterator implements Iterator<BSTElement<K, V>>  {

		SearchTreeIterator(BSTElement<K, V> node) {
		}

		public boolean hasNext() {
			return false;
		}

		public BSTElement<K, V> next() {
			return  null;
		}
	}

	public Iterator<BSTElement<K, V>> iterator() {
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
