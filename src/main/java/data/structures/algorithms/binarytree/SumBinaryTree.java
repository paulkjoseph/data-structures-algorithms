package data.structures.algorithms.binarytree;

import java.util.Objects;

public class SumBinaryTree {

	private BinaryTree binaryTree;

	public SumBinaryTree(BinaryTree binaryTree) {
		this.binaryTree = Objects.requireNonNull(binaryTree);
	}

	private int sum(BinaryTree binaryTree) {
		if (binaryTree == null) {
			return 0;
		}

		return binaryTree.getValue() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
	}

	public int sum() {
		return sum(binaryTree);
	}

}
