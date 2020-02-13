package Common;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public static TreeNode createTree(Integer[] list){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode head = new TreeNode(list[0]);
        TreeNode root;
        q.offer(head);
        int cursor = 1;
        while (cursor < list.length-1){
            while (!q.isEmpty()){
                root = q.poll();
                if(list[cursor] !=null){
                    root.left = new TreeNode(list[cursor]);
                    q.offer(root.left);
                }else{
                    root.left = null;
                }
                if(cursor+1>list.length-1){
                    break;
                }
                cursor++;
                if(list[cursor] !=null){
                    root.right = new TreeNode(list[cursor]);
                    q.offer(root.right);
                }else{
                    root.right = null;
                }
                if(cursor+1>list.length-1){
                    break;
                }
                cursor++;
            }
        }
        return head;
    }
}
