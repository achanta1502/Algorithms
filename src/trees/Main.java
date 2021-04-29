package trees;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		/***
		 * Below Tree
		 * 				    +
		 *                /  \
		 * 				-     7
		 *             /  \        
		 *           6      *
		 *                 / \
		 *                2   4
		 */
		Tree<String> tree = new Tree<String>("+");
		tree.setLeft(new Tree<String>("-"));
		tree.setRight(new Tree<String>("7"));
		Tree<?> left = tree.getLeft();
		left.setLeft(new Tree("6"));
		left.setRight(new Tree("*"));
		Tree<?> left1 = left.getRight();
		left1.setLeft(new Tree("2")); 
		left1.setRight(new Tree("4"));
		
		List<String> tree1 = Arrays.asList("+", "-", "7", "6", "*", null, null, null, null, "2", "4");
		System.out.println(tree1);
		tree.preOrder();
		
		
//		System.out.println(new ArthmeticExpTree().run(t1));
		System.out.println(new MinimumDepth().run(tree));
		System.out.println(new LeftView().run(tree));

		Tree<Integer> maxPath = new Tree<Integer>(10);
		maxPath.setLeft(2);
		maxPath.setRight(10);
		Tree<Integer> maxPathLeft = (Tree<Integer>) maxPath.getLeft();
		Tree<Integer> maxPathRight = (Tree<Integer>) maxPath.getRight();
		maxPathLeft.setLeft(20);
		maxPathLeft.setRight(1);
		maxPathRight.setRight(-25);
		Tree<Integer> maxPathRight2 = (Tree<Integer>) maxPathRight.getRight();
		maxPathRight2.setLeft(3);
		maxPathRight2.setRight(4);
		System.out.println(maxPath);
		System.out.println(new MaximumPathSum().run(maxPath));
		
		Tree<Integer> fullTree = new Tree<Integer>(1);
		fullTree.setLeft(2);
		fullTree.setRight(3);
		Tree<Integer> fullTreeLeft = (Tree<Integer>) fullTree.getLeft();
		fullTreeLeft.setLeft(4);
		System.out.println(new BinaryFullTree().run(fullTree));
		
/**
 *      40
	   /   \
	 30    80 
	  \      \
	  35     100 
 */
		System.out.println(new PreorderTraversalBTArray().run(new int[] {40, 30, 35, 80, 100}));

	}
	

}
