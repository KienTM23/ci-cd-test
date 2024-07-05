package array;

public class ResizeArray {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        ResizeArray arrUtil = new ResizeArray();
//        arrUtil.printArray(new int[] {5,1,2,3,6});
        int[] original = new int[] {2,3,4,5,6};
        original = arrUtil.resize(original,10);
    }
}
