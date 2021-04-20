package cmsc256;

// Import Bridges and relevant data source
import bridges.connect.Bridges;
import bridges.base.BinTreeElement;

import java.util.Map;
import java.util.AbstractMap;
import java.util.Iterator;


public class MyHeap<K extends Comparable<K>, V> implements Iterable<Map.Entry<K,V>>{
	private MyHeapElement<K, V> root;

	public MyHeap() {
		this.root = null;
	}

	public MyHeapElement<K, V> getRoot() {
		return root;
	}

	public void setRoot(MyHeapElement<K, V> root) {
		this.root = root;
	}

	//TODO: implement iteration logic for heaps
	class HeapIterator implements Iterator<Map.Entry<K, V>>  {

		HeapIterator(MyHeapElement<K, V> r) {

		}

		public boolean hasNext() {
			return false;
		}

		public Map.Entry<K, V> next() {
			return new AbstractMap.SimpleEntry<K, V> (null, null);
		}
	}

	public Iterator<Map.Entry<K, V>> iterator() {
		return new HeapIterator(root);
	}

	//TODO
	public boolean isEmpty() {
		return true;
	}

	//TODO
	public void insert(K k, V v) {

	}

	//TODO
	public Map.Entry<K, V> pop() {
		AbstractMap.SimpleEntry<K, V> topEntry = null;
		return topEntry;
	}


	///visualization features.
	public void visualize(Bridges bridges) {

		this.updateLabels();

		// Pass the data structure to Bridges
		bridges.setDataStructure(this.root);

		// Visualize the list
		try {
			bridges.visualize();
		} catch (Exception e) {
			System.err.println("Visualization exception: " + e.getMessage());
		}
	}

	protected void updateLabels() {
		if (root != null)
			updateLabels(root);
	}

	@SuppressWarnings("unchecked")
	private void updateLabels(MyHeapElement<K, V> localRoot) {
		localRoot.setLabel(localRoot.k.toString() + ", " + localRoot.getValue().toString());

		if (localRoot.getLeft() != null)
			updateLabels((MyHeapElement<K, V>)(localRoot.getLeft()));

		if (localRoot.getRight() != null)
			updateLabels((MyHeapElement<K, V>)(localRoot.getRight()));
	}
	
	class MyHeapElement<K extends Comparable<?>, V> extends BinTreeElement<V> {
		private K k;
		private int sizeLeft;
		private int sizeRight;
		
		public int getSizeLeft() {
			return sizeLeft;
		}
		public void setSizeLeft(int sizeLeft) {
			this.sizeLeft = sizeLeft;
		}
		public int getSizeRight() {
			return sizeRight;
		}
		public void setSizeRight(int sizeRight) {
			this.sizeRight = sizeRight;
		}
	}

}
