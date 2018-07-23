package data.structures.algorithms.binarytree;

public class BinaryTree {
	private int value;
    private BinaryTree left;
    private BinaryTree right;
    
    public BinaryTree(int value) {
    		this.value = value;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}
    
    public void insert(int value) {
		if (this.value <= value) {
			if (left == null) {
				left = new BinaryTree(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(value);
			} else {
				right.insert(value);
			}
		}
	}
}
