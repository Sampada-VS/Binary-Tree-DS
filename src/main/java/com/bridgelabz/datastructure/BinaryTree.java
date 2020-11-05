package com.bridgelabz.datastructure;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
	public boolean search(K key) {
		root = searchRecursively(root, key);
		if (root != null)
			return true;
		else
			return false;
	}

	BinaryNode<K> searchRecursively(BinaryNode<K> root, K key) {
		if (root == null || root.key == key)
			return root;
		if (root.key.compareTo(key) > 0)
			return searchRecursively(root.left, key);
		return searchRecursively(root.right, key);
	}
}
