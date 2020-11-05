package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void givenThreeNodes_WhenAddedToTree_ShouldReturnSize3() {
		BinaryTree<Integer> binaryTree=new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		
		int size =binaryTree.getSize();
		assertEquals(3,size);
	}
	@Test
	public void givenThirteenNodes_WhenAddedToTree_ShouldReturnSize13() {
		BinaryTree<Integer> binaryTree=new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		
		int size =binaryTree.getSize();
		assertEquals(13,size);
	}
	@Test
	public void givenBinarySearchTree_WhenSearchForNode_ShouldReturnTrue() {
		BinaryTree<Integer> binaryTree=new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		
		boolean isFound =binaryTree.search(63);
		assertTrue(isFound);
	}
}
