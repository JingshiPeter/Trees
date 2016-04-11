
public class MaxPathSum {
	public static int res = 0;
	public static int findMaxPath(TreeNode root){
		if(root == null) return 0;
		int left = findMaxPath(root.left);
		left = left < 0 ? 0 : left;
		int right = findMaxPath(root.right);
		right = right < 0 ? 0 : right;
		res = Math.max(res, left + root.val + right);
		return left > right ? root.val + left : root.val + right;
	}
}
