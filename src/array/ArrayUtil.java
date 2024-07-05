package array;

public class ArrayUtil {
	//
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

//    public void arrayDemo(){
//        int[] myArray = new  int[5];
//        myArray[0] = 10;
//        myArray[1] = 20;
//        myArray[2] = 30;
//        myArray[3] = 40;
//        myArray[4] = 2;
//        printArray(myArray);
//    }

    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.printArray(new int[] {1,2,3,4,5});
    }
    //Coding interview
    /*
     Given an array of integers, return an array with even integers removed
     Example
      input : arr= {3,2,4,7,10,6,5}
      output : arr= {3,7,5}
     */

//	remove
    int[] removeEven(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
