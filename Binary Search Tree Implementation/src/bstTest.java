import java.util.*;
public class bstTest {

	public static void main(String[] args) {
		
		BST tr = new BST();
		
		Node root = new Node(6);
		tr.insert(root, 4);
		tr.insert(root, 8);
		tr.insert(root, 3);
		tr.insert(root, 5);
		tr.insert(root, 7);
		tr.insert(root, 10);
		//tr.insert(root, 7);
		System.out.print("Pre Order Traversal: ");
		tr.preOrderTraversal(root);
		System.out.println();
		System.out.print("In Order Traversal: ");
		tr.inOrderTraversal(root);
		System.out.println();
		
		System.out.print("Post Order Traversal: ");
		tr.postOrderTraversal(root);
		System.out.println();
		
		System.out.println("Largest element: " + tr.getLargest(root));
		System.out.print("2nd larget element: ");
		tr.getSecLargest(root);
		System.out.println();
		System.out.println("Complete tree: " + tr.isCompleteTree(root));
		//invert the tree
		tr.invert(root);
		System.out.print("Pre Order Traversal with inverted tree: ");
		tr.preOrderTraversal(root);
		
		System.out.println();

	}

}
