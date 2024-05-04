package com.example.TwoPointers;
// Given two sorted arrays of distinct integers, A and B, and an integer C, 
// find and return the pair whose sum is closest to C and the pair has one element from each array.
// More formally, find A[i] and B[j] such that abs((A[i] + B[j]) - C) has minimum value.
// If there are multiple solutions find the one with minimum i and even if there are multiple values of j for the same i 
// then return the one with minimum j.
// Return an array with two elements {A[i], B[j]}.
public class ClosestPairFromSortedArrays {
    public static int[] findPair(int A[],int B[],int C){
        int N1=A.length; int N2=B.length;
        int p1=0; int p2=N2-1;
        int closestDiff=Integer.MAX_VALUE; int closestAIndex=0; int closestBIndex=0;
        while(p1<N1 && p2>=0){
            int sum=A[p1]+B[p2];
            int temp=Math.abs(sum-C);
            if(temp<closestDiff || temp==closestDiff && p1<closestAIndex && p2<closestBIndex){
                closestDiff=temp;
                closestAIndex=p1;
                closestBIndex=p2;      
            }
            if(sum>C){
                p2--;
            }
            else{
                p1++;
            }
        }
        return new int[]{closestAIndex,closestBIndex};

    }
    public static void main(String[] args) {
        
    }
    
}
