int lh = 0;int rh = 0;
TreeNode curr = root;
while(curr != null){
lh++;
curr = curr.left;
}
curr = root;
while(curr != null){
rh++;
curr = curr.right;
}
if(lh == rh)
return (int)Math.pow(2,lh)-1;
return
1 + countNodes(root.left)+ countNodes(root.right);
}