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
    public int countNodes(TreeNode root) {
       /* Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return 0;
        }
        int count=0;
        q.add(root);
        while(!q.isEmpty()){
            int cnt = q.size();
            for(int i=0;i<cnt;i++){
                //List<Integer> list = new ArrayList<>();
                TreeNode node = q.poll();
                count++;
                //list.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                   // count++;
                }
                if(node.right!=null){
                    q.add(node.right);
                    //count++;
                }
            }
        }
        return count;*/
        
        int lh = 0;
        int rh=0;
        TreeNode cur= root;
        while(cur!=null){
                lh++;
                cur= cur.left;
        }
        cur=root;
        while(cur!=null){
            rh++;
            cur=cur.right;
        }
        if(lh==rh){
            return (int)Math.pow(2,lh)-1;
        }
        return 1+countNodes(root.left) + countNodes(root.right);
        
    }
}