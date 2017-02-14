package main;

import apple.laf.JRSUIUtils;

import java.util.Random;

/**
 * Created by Ladi on 14/02/2017.
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(50);
        node = generateTree(node, 50);
        System.out.println(node.val);

    }
    static class TreeNode{
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        int val;
        TreeNode left;
        TreeNode right;
    }


    //root should not be null
    static void add(TreeNode root, int val){
        while(root!=null){
            if(val<root.val){
                if(root.left==null){
                    root.left = new TreeNode(val);
                    return;
                }
                root = root.left;
            }
            else{
                if(root.right==null){
                    root.right = new TreeNode(val);
                    return;
                }
                root = root.right;
            }
        }
    }

    static TreeNode generateTree(int size){
        TreeNode root = new TreeNode(new Random().nextInt(size));
        for(int i=1; i<size; i++){
            add(root, new Random().nextInt(size));
        }
        return root;
    }
    //again root not null
    static TreeNode generateTree(TreeNode root, int size){
        for(int i=1; i<size; i++){
            add(root, new Random().nextInt(size));
        }
        return root;
    }
}
