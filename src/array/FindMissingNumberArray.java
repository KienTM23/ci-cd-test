package array;

public class FindMissingNumberArray {
    /*
    Q. Given an array of n-1 distinct numbers in the range of 1 to n. Find the missing number in it
    Example :
    arr = {2,4,1,8,6,3,7}
    Output:  5
    Explanation : the missing number from range 1 to 8 is 5

     * mathematical approach :
        The sum of first n natural numbers = 1+2+3+....+n = n x (n + 1) / 2
     */

    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = (n * (n + 1))/2;
        for (int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    public void arrayDemo(){
        int[] arr = {2,4,1,8,6,3,7};
        System.out.println(findMissingNumber(arr));
    }

    public static void main(String[] args) {
        FindMissingNumberArray arrUtil = new FindMissingNumberArray();
        arrUtil.arrayDemo();
    }
}
