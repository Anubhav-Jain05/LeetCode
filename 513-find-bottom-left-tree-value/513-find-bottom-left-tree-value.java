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
    public int findBottomLeftValue(TreeNode root) {
       /* Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.add(root);
        TreeNode res=null;
        while(!q.isEmpty()){
           // int sum=0;
            int cnt = q.size();
            res=q.peek();
            for(int i=0;i<cnt;i++){
                TreeNode node = q.poll();
                //res=q.peek();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return res.val;*/
        
        Queue<TreeNode> q= new LinkedList<>();
       // if(root==null){
         //   return 0;
        //}
        q.add(root);
        while(!q.isEmpty()){
            root=q.poll();
            if(root.right!=null){
                q.add(root.right);
            }
            if(root.left!=null){
                q.add(root.left);
            }
        }
        return root.val;
    }
}