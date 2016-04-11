
public class Main {
	public static void main(String[] args){
		TreeNode root = new TreeNode(10);
	    root.left = new TreeNode(2);
	    root.right = new TreeNode(10);
	    root.left.left = new TreeNode(20);
	    root.left.right = new TreeNode(1);
	    root.right.right = new TreeNode(-25);
	    root.right.right.left = new TreeNode(3);
	    root.right.right.right = new TreeNode(4);
	    System.out.println("Hello World");
	    MaxPathSum.findMaxPath(root);
	    int res = MaxPathSum.res;
	    System.out.println(res);
	}
    
}
