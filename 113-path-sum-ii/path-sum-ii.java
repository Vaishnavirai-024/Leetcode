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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();

        find(root,targetSum,list,ans);
        return ans;
    }
    public void find(TreeNode root,int targetSum,List<Integer>list, List<List<Integer>>ans){

        if(root==null)return;

        list.add(root.val);

        if(root.val==targetSum && root.left==null && root.right==null){
            ans.add(new ArrayList<>(list));
        }

        find(root.left,targetSum-root.val,list,ans);
        find(root.right,targetSum-root.val,list,ans);
        
        list.remove(list.size()-1);
        return;
    }
}