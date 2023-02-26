    boolean checkBST(Node root) {
         return isBST(root, -1, -1); 
    }
  boolean isBST(Node root, int lowValue, int highValue) {
  if(root == null) {
    return true;
  } else if (lowValue >= 0 && root.data <= lowValue) {
    return false;
  } else if (highValue >= 0 && root.data >= highValue) {
    return false;
  } 

  return (isBST(root.left,lowValue,root.data) && isBST(root.right,root.data,highValue) );
}