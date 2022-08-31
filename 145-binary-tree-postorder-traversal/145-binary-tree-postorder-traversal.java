/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list =new LinkedList<>();
        Stack<TreeNode> s= new Stack<>();
        if(root==null){
            return list;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode node= s.pop();
            list.addFirst(node.val);
            if(node.left!=null){
                s.push(node.left);
            }
            if(node.right!=null){
                s.push(node.right);
            }
            
            
        }
        
        return list;
    }

}
//LinkedList<Integer> ans = new LinkedList<>();
	/*Stack<TreeNode> stack = new Stack<>();
	if (root == null) return ans;
	
	stack.push(root);
	while (!stack.isEmpty()) {
		TreeNode cur = stack.pop();
		ans.addFirst(cur.val);
		if (cur.left != null) {
			stack.push(cur.left);
		}
		if (cur.right != null) {
			stack.push(cur.right);
		} 
	}
	return ans;*/