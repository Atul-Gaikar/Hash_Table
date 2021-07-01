package com.bridgelabz.hashtable;

public class HashMap<K, V> {
	// Called linked list to do the Hash Table Operation

	MyLinkedList<K> myList;

	public void MyHashmap() {
		this.myList = new MyLinkedList<>();
	}

	// Getting and Adding values
	public V get(K Key) {
		MapNode<K, V> mapNode = (MapNode<K, V>) this.myList.search(Key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		MapNode<K, V> mapNode = (MapNode<K, V>) this.myList.search(key);
		if (mapNode == null) {
			mapNode = new MapNode<>(key, value);
			this.myList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}

	}

	@Override
	public String toString() {
		return "MyHashMapNodes{ " + myList + " }";
	}
}