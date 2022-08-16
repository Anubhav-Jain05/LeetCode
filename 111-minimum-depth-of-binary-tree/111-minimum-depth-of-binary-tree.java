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
    public int minDepth(TreeNode root) {
       /* if(root==null) return 0;
        int left = minDepth(root.left);
        int right=minDepth(root.right);
        return (left==0 || right==0)? left + right +1 : Math.min(left,right)+1;*/
        
        Queue<TreeNode> queue= new LinkedList<>();
        if(root==null){
            return 0;
        }
        queue.add(root);
        int count=0;
        while(!queue.isEmpty()){
            int cnt=queue.size();
            count++;
            for(int i=0;i<cnt;i++){
                TreeNode node = queue.poll();
                if(node.left==null && node.right==null){
                    return count;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
           // count++;
        }
        return count;
    }
}