package array;

public class MoveAllZeroToEndArray {
    /*
    Q. Given an array of integers, write a function to move all 0's to end of it while
    maintaining the relative order of the non-zero elements.
    Example:
        Given array of integers - {0,1,0,4,12}
    Solution -
        {1,4,12,0,0}
     */

    public void moveZeros(int[] arr, int n){
        int j = 0;  // focus on zeroth elements
        for (int i = 0; i < n; i++) { // i will focus non zero elements
            if (arr[i]!=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int [] arr = {8,1,0,2,1,0,3};
        printArray(arr);
        moveZeros(arr,arr.length);
        printArray(arr);
    }

    public static void main(String[] args) {
        MoveAllZeroToEndArray arrUtil = new MoveAllZeroToEndArray();
        arrUtil.arrayDemo();
    }
}
