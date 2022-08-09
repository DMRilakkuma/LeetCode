package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shkstart
 * @create 2022-04-02 12:06
 */
public class Mian116 {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue <Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
           int size = queue.size();
           for (int i = 0; i < size; i++) {
               Node poll = queue.poll();

               if(i < size -1){
                   poll.next = queue.peek();
               }

               if(poll.left!=null){
                   queue.add(poll.left);
               }

               if(poll.right != null){
                   queue.add(poll.right);
               }
           }

        }
        return root;
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        val = val;
        left = left;
        right = right;
        next = next;
    }
}