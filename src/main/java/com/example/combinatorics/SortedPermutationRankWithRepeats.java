package com.example.combinatorics;

// Given an array of integers A, find and return the peak element in it.
// An array element is considered a peak if it is not smaller than its neighbors.
// For corner elements, we need to consider only one neighbor.
public class SortedPermutationRankWithRepeats {
    public static int peakElement(int A[]){
        int s=0; int e=A.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if((mid==0 || A[mid]>=A[mid-1]) && (mid==A.length-1 || A[mid]>=A[mid+1])){
                return A[mid];
            }
            else if(mid>0 && A[mid]<A[mid-1]){ //MOVE LEFT
                e=mid-1;
            }
            else{                              // MOVE RIGHT
                s=mid+1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        System.out.println(peakElement(A));
    }
    
}
