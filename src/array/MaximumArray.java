package array;

public class MaximumArray {
    /*
    Q. Given an array of integers, return second maximum value.
    The second maximum value exists
    Example -
        input : arr= {12,34,2,34,33,1}
        output : 33
     */

    int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
