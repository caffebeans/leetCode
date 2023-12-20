package gredy;


/***
 * 爬楼梯
 * 你每次只能爬一个台阶或者是二个台阶，你一共有多少种方法
 */
public class ClimbingStairs {


    public int climbStairs(int n) {

        if (n==0||n==1) return 1;
        if (n==2) return 2;
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;


        for (int i = 3; i <=n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }


        return arr[n];




    }

    public static void main(String[] args) {

        int arr[] = new int[45];
    }

}
