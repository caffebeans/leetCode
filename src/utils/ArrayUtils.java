package utils;

public class ArrayUtils {


    public static void printout(int[] arr){

        System.out.println();
        for (int ints : arr) {

                System.out.print(ints+"->");


        }
        System.out.println();
    }

    public static void printout(String[] arr){

        System.out.println();
        for (String ints : arr) {

            System.out.print(ints+"->");


        }
        System.out.println();
    }


    public static void printout(int[][] arr){

        for (int[] ints : arr) {

            for (int anInt : ints) {
                System.out.print(anInt+"     ");
            }
            System.out.println();

        }
    }

    public static void printout(boolean[][] arr){

        for (boolean[] ints : arr) {

            for (boolean anInt : ints) {
                System.out.print(anInt+"     ");
            }
            System.out.println();

        }
    }

    public static void swap(int[] arr,int x,int y){
         if(x>=arr.length||y>=arr.length) return;
         int temp = arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
    }

}
