import java.util.*;
public class BST {

	public Node insert(Node node, int value) {
		
		if (node == null) {
			return new Node(value);
			}

		else if (value <= node.data) {
		    node.left = insert(node.left, value);
		    }
		else {
		    node.right = insert(node.right, value);
		    } 
		    
		return node;
	}
	

	public static void preOrderTraversal(Node node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public static void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.data + " ");
			inOrderTraversal(node.right);
		}
	}
	
	public static void postOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	/*public Node findNode(Node node, int n) {
		
		int value = node.data;
		while(value != n)}{
			findNode(node.left, n);
			findNode(node.right, n);
		}
		
		return node;
		
	}*/
	
	public void invert(Node node) {
		
		if(node != null) {
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
			invert(node.left);
			invert(node.right);
			
		}
	}

	
	public int getLargest(Node node) {
		
		while(node.right != null) {
			node = node.right;
		}
		
		return node.data;
	}
	
	public static void getSecLargest(Node node) {
		
		/*List<Integer> list = new ArrayList<>();
		list.add(node.data);
		while(node.right != null) {
			node = node.right;
			list.add(node.data);
		}
		
		Collections.sort(list);
		return list.get(list.size()-2);*/
		
		//optimized algorithm
		if (node.right == null && node.left != null) {  
	        getSecLargest(node.left);  
	    }  
	    
	    // we are looking at the parent of the largest element
	    // and the largest element has no children
	    // so this is the node we want
		else {
			if (node.right != null &&  node.right.left == null && node.right.right == null) {  
	        	System.out.print(node.data);  
	        	}
			else getSecLargest(node.right);
	    }  
	  
	
	}
	
	//returns if the tree is complete
	public boolean isCompleteTree(Node root) {
	       Queue<Node> q = new LinkedList<Node>();
	        q.add(root);
	        int n = 1;
	        while(!q.isEmpty()){
	            
	            Node curr = q.poll();
	            if(curr == null){
	                n = 0;
	            }
	            else{
	                if(n==0){
	                    return false;
	                }
	                q.add(curr.left);
	                q.add(curr.right);
	            }
	        }
	        return true;
	    }

}
