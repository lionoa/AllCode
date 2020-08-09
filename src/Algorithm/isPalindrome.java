package Algorithm;

import java.util.Scanner;

public class isPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number!");
        String x = sc.nextLine();
        sc.close();
        long num = Long.parseLong(x);
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(num));
    }
}
class Solution{
    public boolean isPalindrome(long x){
        if(x < 0 || ( x % 10 == 0 && x != 0)){
            return false;
        }
        long revertedNumber = 0;
        while(x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
