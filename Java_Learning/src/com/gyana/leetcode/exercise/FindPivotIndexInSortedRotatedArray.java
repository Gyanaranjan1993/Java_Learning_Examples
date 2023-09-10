package com.gyana.leetcode.exercise;

public class FindPivotIndexInSortedRotatedArray {

    /*
      Find pivot index using binary search

      1. Find the midIndex.
      2. If value at midIndex > value at midIndex+1, then midIndex+1 is the index of pivot
      3. Else if value at midIndex-1 > value at midIndex, then midIndex is index of pivot.
      4. else if value at leftIndex is less than value at midIndex, then the pivot must lie in the second half of the array.
      5. else if value at leftIndex > value at midIndex, then the pivot must lie in the first half of the array.

     */

    private static int findPivot(int[] arr, int left, int right){
        if(left > right){
            return -1;
        }

        if(right == left){
            return left;
        }

        int mid = (left + right) / 2;
        if (arr[mid] > arr[mid + 1]){
            return mid + 1;
        } else if(arr[mid-1] > arr[mid]){
            return mid;
        } else if(arr[left] < arr[mid]){
            return findPivot(arr, mid+1, right);
        } else{
            return findPivot(arr, left, mid-1);
        }

    }
}
