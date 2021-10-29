package utils;

import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: 张亮
 * @date: 2021/6/18
 **/
public class ListNodeUtil {

    public static ListNode createListNode(int[] nums){

        ListNode head = null;


        for (int x:nums){
            ListNode listNode = new ListNode(x);
            listNode.next=head;
            head=listNode;
        }


        return head;
    }


    public static void main(String[] args) {

         ListNodeUtil.createListNode(new int[]{4,3,2,1});




    }

    public static void printout(ListNode listNode) {

               ListNode p = listNode;
               if (p==null) return;
               while (p!=null){
                   System.out.print(p.val+"-->");
                   p=p.next;
               }

    }

    public static TreeNode constructTree(Integer[] array) {
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }

        int index = 0;
        int length = array.length;

        TreeNode root = new TreeNode(array[0]);
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        TreeNode currNode;
        while (index < length) {
            index++;
            if (index >= length) {
                return root;
            }
            currNode = nodeQueue.poll();
            Integer leftChild = array[index];
            if (leftChild != null) {
                currNode.left = new TreeNode(leftChild);
                nodeQueue.offer(currNode.left);
            }
            index++;
            if (index >= length) {
                return root;
            }
            Integer rightChild = array[index];
            if (rightChild != null) {
                currNode.right = new TreeNode(rightChild);
                nodeQueue.offer(currNode.right);
            }
        }

        return root;
    }
}
