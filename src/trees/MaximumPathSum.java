package trees;

public class MaximumPathSum {
	public int run(Tree<Integer> tree) throws Exception {
		if (tree == null) {
			throw new IllegalAccessException("Tree should not be null");
		}
		Result res = new Result();
		res.val = Integer.MIN_VALUE;
		compute(tree, res);
		return res.val;
	}
	
	private int compute(Tree<?> tree, Result res) {
		if (tree == null) {
			return 0;
		}
		
		int left = compute(tree.getLeft(), res);
		int right = compute(tree.getRight(), res);
		// Returns maximum till node
		int val = Math.max(Math.max(left, right) + (int) tree.getData(), (int) tree.getData());
		// Stores all combinations max value
		res.val = Math.max(val, (int) tree.getData() + right + left);
		return val;
	}
	
	class Result {
		int val;
	}
}
