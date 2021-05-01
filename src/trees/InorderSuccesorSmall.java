package trees;

public class InorderSuccesorSmall {
	
	public <T> int run(Tree<T> tree) throws Exception {
		
		if (tree == null) {
			throw new IllegalArgumentException("Tree should not be null");
		}
		
		if (tree.getRight() != null) {
			return getLeft(tree.getRight());
		}
		
		Tree<T> parent = tree.getParent();
		while (parent != null && tree == parent.getRight()) {
			tree = parent;
			parent = parent.getParent();
		}
		return (int) parent.getData();
	}
	
	private <T> int getLeft(Tree<T> tree) {
		if (tree.getLeft() == null && tree.getRight() == null) {
			return (int) tree.getData();
		}
		return getLeft(tree.getLeft());
	}
}
