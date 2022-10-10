package bai50;

import java.util.Arrays;

public class Solution {
    
        public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0) {
           return ((1 / x) * (myPow(1 / x, -(n + 1))));
        } 
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2); 
        }
    public static void main(String[] args) {
        int x = 5;
        int n = 5;
        myPow(x,n);
        System.out.println((myPow(x,n )));
    }
}
