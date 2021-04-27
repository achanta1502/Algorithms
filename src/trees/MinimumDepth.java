package trees;

/**
 * Given a binary tree, find its minimum depth.
 *  The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node. 
 */
public class MinimumDepth {
	
	public int run(Tree<?> tree) {
		return compute(tree);
	}
	
	public int compute(Tree<?> tree) {
		if (tree == null) {
			return 0;
		}
		
		if (tree.getLeft() == null && tree.getRight() == null) {
			return 1;
		}
		
		if (tree.getLeft() == null) {
			return 1 + compute(tree.getRight());
		}
		
		if (tree.getRight() == null) {
			return 1 + compute(tree.getLeft());
		}
		
		return Math.min(compute(tree.getLeft()) + 1, compute(tree.getRight()) + 1);
	}
}
