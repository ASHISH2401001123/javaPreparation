package Arrays;

public class Seprate0and1InArray {
    static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,0};
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start]==0){
                start++;
            }
            else if(arr[end]==1){
                end--;
            }
            else{
                int temp =arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
