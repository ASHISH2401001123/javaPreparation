package Functions;

public class Reverse_Number {
    static int reverse(int num){
        int rev=0;
        // num=123
        while(num!=0) {
            int lastdigit = num % 10; // get last digit
            rev = rev * 10 + lastdigit; //convert into int
            num = num / 10;    // remove last digit
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));

    }
}
