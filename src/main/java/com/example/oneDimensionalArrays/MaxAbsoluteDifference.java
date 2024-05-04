package com.example.oneDimensionalArrays;
// You are given an array of N integers, A1, A2, .... AN.

// Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, 
// where |x| denotes absolute value of x.


public class MaxAbsoluteDifference {
    public static int MaxDifference(int A[]){
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        //LOGIC IS TO FIND THE MAX OF MAX1-MIN1 AND MAX2 -MIN2
        for(int i=0;i<A.length;i++){
            //DO FOR MAX1 AND MIN1
            if(max1<A[i]+i){
                max1=A[i]+i;
            }
            if(min1>A[i]+i){
                min1=A[i]+i;
            }
            //DO FOR MAX2 AND MIN2
            if(max2<A[i]-i){
                max2=A[i]-i;
            }
            if(min2>A[i]-i){
                min2=A[i]-i;
            }
        }
        int x= Math.max(Math.abs(max1-min1),Math.abs(max2-min2)); 
        return x;
    } 
    public static void main(String[] args) {
        int A[]={2};
        System.out.println(MaxDifference(A));
    }
}
