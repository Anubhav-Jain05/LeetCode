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
    public int maxDepth(TreeNode root) {
       /* Queue<TreeNode> queue= new LinkedList<>();
        if(root==null){
            return 0;
        }
       
        queue.add(root);
         int count=0;
        while(!queue.isEmpty()){
            int cnt = queue.size();
            count++;
            for(int i=0;i<cnt;i++){
                //List<Integer> level = new ArrayList<>();
                TreeNode node = queue.poll();
                //level.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
        }
        return count;*/
        
        
        // recursive approach
        
       /* if(root==null){
           return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));*/
        return (root==null)?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
        
    }
}