package test;

import utils.TreeNode;

import javax.swing.border.EmptyBorder;
import java.util.*;

/**
 * @description:
 * @author: 张亮
 * @date: 2021/10/11
 **/
public class Test {
    public static void main(String[] args) {

        int n = numSquares(13);

        Map map = new HashMap();

        System.out.println(n);
    }




        public static int numSquares(int n) {

        int seq = (int) Math.sqrt(n);
        if (n==0) return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0]=0;
        dp[1]=1;


            for (int i = 2; i <=n; i++) {
                dp[i]=i;
                for (int j = 1; j <=i ; j++) {
                    if (j*j>i) continue;
                    dp[i]=Math.min(dp[i],dp[i-j*j]+1);
                }

            }


            return dp[n];

        }


        Deque<Integer> deque  = new ArrayDeque<>();

        public int kthSmallest(TreeNode root, int k) {

            dfs(root);
            int ans = 0;
            int res = -1;
            while (ans<k&&!deque.isEmpty()){
                deque.removeFirst();
            }


            if (!deque.isEmpty()) return deque.removeFirst();
            return -1;

        }

        public void dfs(TreeNode root){
            if (root==null) return;
            dfs(root.left);
            deque.addLast(root.val);
            dfs(root.right);
        }






}
