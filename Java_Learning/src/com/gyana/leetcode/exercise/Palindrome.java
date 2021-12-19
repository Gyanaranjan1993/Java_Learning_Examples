package com.gyana.leetcode.exercise;

/**
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int result = 0;
        while (x > result) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result == x || x == result / 10;

    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(15651));
    }
}
