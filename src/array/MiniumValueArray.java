package array;

public class MiniumValueArray {

    public int findMinium(int[] arr){
        //edge
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid input");
        }
        //logic
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,15,1,7};

        MiniumValueArray min = new MiniumValueArray();
        System.out.println(min.findMinium(arr));
    }
}
