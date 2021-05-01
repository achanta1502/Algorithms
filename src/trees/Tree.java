package trees;

public class Tree<T> {
	private Tree<T> left;
	private Tree<T> right;
	private Tree<T> parent;
	private T data;
	
	public Tree(Tree<T> left, Tree<T> right, T data) {
		this.left = left;
		this.right = right;
		this.data = data;
		this.parent = null;
	}
	
	public Tree(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public Tree<T> getParent() {
		return parent;
	}
	
	public void setParent(Tree<T> parent) {
		this.parent = parent;
	}
	
	public Tree<T> getLeft() {
		return left;
	}

	public void setLeft(Tree<T> left) {
		this.left = left;
		this.left.setParent(this);
	}
	
	public void setLeft(T left) {
		this.left = new Tree<T>(left);
		this.left.setParent(this);
	}

	public Tree<T> getRight() {
		return right;
	}
	
	public void setRight(T right) {
		this.right = new Tree<T>(right);
		this.right.setParent(this);
	}

	public void setRight(Tree<T> right) {
		this.right = right;
		this.right.setParent(this);
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
	
	private void preOrderImpl(Tree<T> tree) {
		if (tree == null) return;
		if (tree.getData() != null)
		System.out.println(tree.getData());
		preOrderImpl(tree.getLeft());
		preOrderImpl(tree.getRight());
	}
	
	public void inOrder() {
		inOrderImpl(this);
	}
	
	private void inOrderImpl(Tree<T> tree) {
		if (tree == null) return;
		preOrderImpl(tree.getLeft());
		if (tree.getData() != null)
		System.out.println(tree.getData());
		preOrderImpl(tree.getRight());
	}
	
	public void postOrder() {
		postOrderImpl(this);
	}
	
	private void postOrderImpl(Tree<T> tree) {
		if (tree == null) return;
		preOrderImpl(tree.getLeft());
		preOrderImpl(tree.getRight());
		if (tree.getData() != null)
		System.out.println(tree.getData());
	}
	
	public boolean equals(Tree<T> t) {
		return equalsImpl(this, t);
	}
	
	private boolean equalsImpl(Tree<T> tree1, Tree<T> tree2) {
		
		if (tree1 == null && tree2 == null) {
			return true;
		}
		
		if (tree1 != null && tree2 != null && tree1.getData().equals(tree2.getData())) {
			return equalsImpl(tree1.getLeft(), tree2.getLeft()) && equalsImpl(tree1.getRight(), tree2.getRight());
		}
		

		return false;
	}
	
	public boolean mirror(Tree<T> t) {
		return mirrorImpl(this, t);
	}
	
	private boolean mirrorImpl(Tree<T> tree1, Tree<T> tree2) {
		
		if (tree1 == null && tree2 == null) {
			return true;
		}
		
		if (tree1 != null && tree2 != null && tree1.getData().equals(tree2.getData())) {
			return equalsImpl(tree1.getLeft(), tree2.getRight()) && equalsImpl(tree1.getRight(), tree2.getLeft());
		}
		
		return false;
	}
}
