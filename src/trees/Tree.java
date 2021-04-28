package trees;

public class Tree<T extends Object> {
	private Tree<?> left;
	private Tree<?> right;
	private T data;
	
	public Tree(Tree<?> left, Tree<?> right, T data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public Tree(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Tree<?> getLeft() {
		return left;
	}



	public void setLeft(Tree<?> left) {
		this.left = left;
	}
	
	public void setLeft(T left) {
		this.left = new Tree<T>(left);
	}

	public Tree<?> getRight() {
		return right;
	}
	
	public void setRight(T right) {
		this.right = new Tree<T>(right);
	}

	public void setRight(Tree<?> right) {
		this.right = right;
	}



	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Tree [Left=" + left + ", data=" + data + ", Right=" + right + "]";
	}
	
	public void preOrder() {
		preOrderImpl(this);
	}
	
	private void preOrderImpl(Tree<?> tree) {
		if (tree == null) return;
		if (tree.getData() != null)
		System.out.println(tree.getData());
		preOrderImpl(tree.getLeft());
		preOrderImpl(tree.getRight());
	}
	
	public void inOrder() {
		inOrderImpl(this);
	}
	
	private void inOrderImpl(Tree<?> tree) {
		if (tree == null) return;
		preOrderImpl(tree.getLeft());
		if (tree.getData() != null)
		System.out.println(tree.getData());
		preOrderImpl(tree.getRight());
	}
	
	public void postOrder() {
		postOrderImpl(this);
	}
	
	private void postOrderImpl(Tree<?> tree) {
		if (tree == null) return;
		preOrderImpl(tree.getLeft());
		preOrderImpl(tree.getRight());
		if (tree.getData() != null)
		System.out.println(tree.getData());
	}
	
	public boolean equals(Tree<?> t) {
		return equalsImpl(this, t);
	}
	
	private boolean equalsImpl(Tree<?> tree1, Tree<?> tree2) {
		
		if (tree1 == null && tree2 == null) {
			return true;
		}
		
		if (tree1 != null && tree2 != null && tree1.getData().equals(tree2.getData())) {
			return equalsImpl(tree1.getLeft(), tree2.getLeft()) && equalsImpl(tree1.getRight(), tree2.getRight());
		}
		

		return false;
	}
	
	public boolean mirror(Tree<?> t) {
		return mirrorImpl(this, t);
	}
	
	private boolean mirrorImpl(Tree<?> tree1, Tree<?> tree2) {
		
		if (tree1 == null && tree2 == null) {
			return true;
		}
		
		if (tree1 != null && tree2 != null && tree1.getData().equals(tree2.getData())) {
			return equalsImpl(tree1.getLeft(), tree2.getRight()) && equalsImpl(tree1.getRight(), tree2.getLeft());
		}
		

		return false;
	}
}
