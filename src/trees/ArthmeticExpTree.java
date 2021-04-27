package trees;

public class ArthmeticExpTree {
	
	public Integer run(Tree<?> tree) throws Exception {
		if (tree == null) {
			throw new IllegalAccessException("Tree should be valid");
		}
		return compute(tree);
	}
	
	private Integer compute(Tree<?> tree) throws IllegalAccessException {
		if ( tree.getLeft() == null &&  tree.getRight() == null) {
			return Integer.parseInt((String) tree.getData());
		}
		
		String operator =  (String) tree.getData();
		Integer total = 0;
		
		switch (operator) {
		case "+":
			total = compute( tree.getLeft()) + compute( tree.getRight());
			break;
		case "-":
			total = compute( tree.getLeft()) - compute( tree.getRight());
			break;
		case "*":
			total = compute( tree.getLeft()) * compute( tree.getRight());
			break;
		case "/":
			total = compute( tree.getLeft()) / compute( tree.getRight());
			break;

		default:
			throw new IllegalAccessException("Unknown Operation is detected. Operator: " + operator);
		}
		
		return total;
	}
}
