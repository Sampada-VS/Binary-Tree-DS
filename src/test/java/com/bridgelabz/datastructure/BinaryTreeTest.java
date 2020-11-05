package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void GivenThreeNodes_WhenAddedToTree_ShouldReturnSize3() {
		BinaryTree<Integer> binaryTree=new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size =binaryTree.getSize();
		assertEquals(3,size);
	}

}
