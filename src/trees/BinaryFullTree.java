package trees;

public class BinaryFullTree {
	public <T> boolean run(Tree<T> tree) {
		
		return compute(tree);
	}
	
	private <T> boolean compute(Tree<T> tree) {
		if (tree == null) {
			return true;
		}
		
		if (tree.getLeft() == null && tree.getRight() == null) {
			return true;
		}
		
		if (tree.getLeft() == null || tree.getRight() == null) {
			return false;
		}
		
		return compute(tree.getLeft()) && compute(tree.getRight());
	}
}
