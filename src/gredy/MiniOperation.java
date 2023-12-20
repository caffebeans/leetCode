package gredy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.IntStream;

public class MiniOperation {


    public int halveArray(int[] nums) {

        Arrays.sort(nums);
        int len = nums.length;
        int index = len;
        int dep = 0;
        int sum = IntStream.of(nums).sum();
        Deque deque = new ArrayDeque();
        int operation = 0;   //记录的是操作数

        //只要每次操作去的数的总和多于一半就行
        for (int i = len-1; i >=0 ; i--) {


            dep+=nums[i]/2;
            operation++;
            if (2*dep>sum)
                break;
            //比较当前位
            deque.addLast(nums[i]/2);




        }





        return operation;

    }


}
