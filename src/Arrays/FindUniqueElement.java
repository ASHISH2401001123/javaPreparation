package Arrays;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {10,20,10,20,30,30,50};
        int unique = 0;
        for(int i:arr){
            unique = i^unique;

        }
        System.out.println(unique);

    }
}
