package search;

import java.sql.Array;

/**
 * @description: 归并排序算法
 * @author: 张亮
 * @date: 2021/10/28
 **/
public class MergSorgAlgorium {


    public static void main(String[] args) {
        int[] arr = new int[]{9,12,3,5,5};
        mergSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void mergSort(int[] arr, int left, int right) {
        if (left>=right) return;
         int mid = (left+right)>>>1;
         mergSort(arr,left,mid);
         mergSort(arr,mid+1,right);
         merg(arr,left,mid,right);
    }
    private static void merg(int[] arr, int left, int mid,int right){
          int[] tem = new int[right-left+1];
          int s1=left;
          int s2=mid+1;
          int index=0;
          while (s1<=mid&&s2<=right){
              if (arr[s1]<arr[s2])
                  tem[index++]=arr[s1++];
              else
                  tem[index++]=arr[s2++];
          }
          while (s1<=mid){
              tem[index++]=arr[s1++];
          }
          while (s2<=right){
              tem[index++]=arr[s2++];
          }
        for (int j = 0; j<tem.length ; j++) {      //注意此处的长度为tem.lenght
            arr[left+j]=tem[j];
        }

    }

}
