package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftView {
	@SuppressWarnings("unchecked")
	public List<String> run(Tree<String> tree) {
		List<String> output = new ArrayList<String>();
		
		if (tree == null) {
			return null;
		}
		
		Queue<Tree<String>> queue = new LinkedList<Tree<String>>();
		queue.add(tree);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			boolean leftView = true;
			for (int i = 0; i < size; i++) {
				Tree<String> temp = queue.poll();
				if (leftView && temp != null) {
				output.add(temp.getData());
				leftView = false;
				}
				if (temp.getLeft() != null) {
					queue.add((Tree<String>) temp.getLeft());
				}
				
				if (temp.getRight() != null) {
					queue.add((Tree<String>) temp.getRight());
				}
			}
		}
		return output;
	}
}
