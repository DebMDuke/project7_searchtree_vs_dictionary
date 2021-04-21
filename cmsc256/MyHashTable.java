package cmsc256;
/**
 *   CMSC 256
 *   Computer Science Department
 *   College of Engineering
 *   Virginia Commonwealth University
 */
import bridges.base.Label;
import bridges.base.Polyline;
import bridges.base.Rectangle;
import bridges.base.SymbolCollection;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;
import java.util.Map;
import java.util.Iterator;
import java.lang.Comparable;
import java.io.IOException;

public class MyHashTable<K, V> 
{
	private MapNode[] table;
	private int capacity;
	private double loadFactor;
	private int count;
	private final static int defaultCapacity = 30;
	private final static double defaultLoadFactor = 10.0;
	
//	Default constructor uses the default values for both
//	capacity and load factor to create the hash table
	public MyHashTable() {
		this(defaultCapacity, defaultLoadFactor);
	}

//	Single argument constructor uses the default values 
//	for the load factor to create the hash table
	public MyHashTable(int capacity) {
		this(capacity, defaultLoadFactor);
	}

	public MyHashTable(int capacity, double loadFactor) {
		this.loadFactor = loadFactor;
		this.capacity = capacity;
		this.table = new MapNode[this.capacity];
		this.count = 0;
	}

	//TODO: implement iterator logic by providing any missing code needed 
	/*
	 * Provides the implementation of the Iterator interface
	 * for the hash table 
	 * Note: the optional remove method is not implemented
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
	 */
	private class HashTableIterator implements Iterator<Map.Entry<K, V>> {
				
		//TODO: complete constructor implementation
		public HashTableIterator() {
			
			
		}
		
		//TODO: return true if there is another entry in the table
		public boolean hasNext() {
			return false;
		}

		//TODO: returns the next entry in the table
		public Map.Entry<K, V> next() {
			return  null;
		}
	}

	
	public Iterator<Map.Entry<K, V>> iterator() {
		return new HashTableIterator();
	}

	//TODO:  
	public V get(K key) {
		return null;
	}

	//TODO
	public void set(K key, V value) {

	}


	//TODO
	private void resize(int capacity) {

	}

	//visualization function
	public void visualize(Bridges bridgesInstance) throws IOException, RateLimitException {
		SymbolCollection vis = new SymbolCollection();
		Rectangle rect;
		Label label;
		Polyline line;

		int maxx = 0;
		float label_width=100;
		float label_height=25;
		float spacing_width=50;


		for (int i = 0; i < this.table.length; ++i) {
			int x = 0;
			int y = (this.capacity - i) * 30;

			rect = new Rectangle(x, y, 25, 25);
			rect.setFillColor("white");
			vis.addSymbol(rect);

			label = new Label(String.valueOf(i));
			label.setLocation((float)(x+25/2.), (float)(y+25/2.));
			label.setFontSize(12);
			vis.addSymbol(label);

			x += 62.5;

			MapNode node = this.table[i];
			while (node != null) {
				rect = new Rectangle(x, y, label_width, label_height);
				rect.setFillColor("white");
				vis.addSymbol(rect);

				label = new Label(String.format("%s: %d", node.getKey(), node.getValue()));
				label.setLocation((float)(x+label_width/2.), (float)(y+label_height/2.));
				label.setFontSize(12);
				vis.addSymbol(label);

				line = new Polyline();
				line.addPoint((float)(x + label_width), (float)(y+label_height/2.));
				line.addPoint((float)(x + label_width+spacing_width), (float)(y+label_height/2.));
				line.addPoint((float)(x + label_width+3./4.*spacing_width), (float)(y) );
				line.addPoint((float)(x + label_width+spacing_width), (float)(y+label_height/2.));
				line.addPoint((float)(x + label_width+3./4.*spacing_width), (float)(y + label_height));
				line.setStrokeWidth(1);
				line.setStrokeColor("red");
				vis.addSymbol(line);

				x += label_width+spacing_width;
				node = node.getNext();
			}

			if (x > maxx)
				maxx=x;

			rect = new Rectangle(x, y, label_width, label_height);
			rect.setFillColor("white");
			vis.addSymbol(rect);

			label = new Label("null");
			label.setLocation((float)(x+label_width/2.), (float)(y+label_height/2.));
			label.setFontSize(12);
			vis.addSymbol(label);
		}

		vis.setViewport (-30.f, (float)(maxx+200), -30.f, (this.capacity+1)*30.f);
		bridgesInstance.setDataStructure(vis);
		bridgesInstance.visualize();
	}

class MapNode<K, V> {
	 private K key;
	 private V value;
	 private MapNode next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MapNode getNext() {
		return next;
	}

	public void setNext(MapNode next) {
		this.next = next;
	}
    }
}
