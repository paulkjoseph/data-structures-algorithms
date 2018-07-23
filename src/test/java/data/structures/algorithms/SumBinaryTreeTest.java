package data.structures.algorithms;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

import data.structures.algorithms.binarytree.BinaryTree;
import data.structures.algorithms.binarytree.SumBinaryTree;

public class SumBinaryTreeTest {

	@Test
	public void testSumBinaryTree() {
		// Given;
		SumBinaryTree sumBinaryTree = new SumBinaryTree(createBinaryTree(new int[] { 1, 2, 3 }));

		// When:
		int result = sumBinaryTree.sum();

		// Then:
		assertThat("The sum should be equal to " + result, result, equalTo(6));
	}

	private BinaryTree createBinaryTree(int[] values) {
		BinaryTree binaryTree = new BinaryTree(values[0]);
		for (int i = 1; i < values.length; i++) {
			binaryTree.insert(values[i]);
		}
		return binaryTree;
	}
}
