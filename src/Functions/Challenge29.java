package Functions;
import java.util.Scanner;



public class Challenge29 {
    public static int oddsum(int num) {
        int count = 0;
        int i = 1;
        while (i <= num) {
            count = count + i;
            i = i + 2;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number that you want to stop : ");
        int num = sc.nextInt();
        int result = oddsum(num);
        System.out.println(result);
    }

}
