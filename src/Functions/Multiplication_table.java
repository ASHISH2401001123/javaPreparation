
package Functions;
import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number that you want to print table : ");
        int num = sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(num +"*" +i +"=" + (num*i));
            i++;
        }

    }
}
