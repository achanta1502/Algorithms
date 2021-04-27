package trees;

import java.util.List;

public class Utils {
	
	public static <T> Tree<T> convertArrayToTree(List<T> array) throws Exception {
		if (array.size() % 2 == 0) {
			throw new IllegalAccessException("Tree should e completely defined.");
		}
		return constructTree(array, 0);
	}
	
	private static <T> Tree<T> constructTree(List<T> array, int index) {
		if (index >= array.size()) {
			return null;
		}
		Tree<T> tree = new Tree<T>(array.get(index));
		tree.setLeft(constructTree(array, 2 * index + 1));
		tree.setRight(constructTree(array, 2 * index + 2));
		return tree;
	}
}
