package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int start = 0;    //starting index
        int end = arr.length-1;   // ending index

        while(start<end) {
        //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        // start move to left to right
            start++;

        // end move to right to left
            end--;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
