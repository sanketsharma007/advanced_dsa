package com.example.TwoPointers;

// Given an one-dimensional integer array A of size N and an integer B.
// Count all distinct pairs with difference equal to B.
// Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.

public class CountDiffPairs {
    public static int countPairs(int A[],int B){
        int p1=0;
        int p2=1;
        int count=0;
        int N=A.length;
        while(p1<N && p2<N){
            //IF P1 AND P2 ARE POINTING TO THE SAME INDEX
            if(p1==p2){
                p2++;
                continue;
            }
            int diff=A[p2]-A[p1];
            if(diff==B){
                count++;
                int x=A[p1]; int y=A[p2];
                //WE WANT DISTINCT PAIRS SO DO P1++ AND P2++ TILL THE PAIRS ARE SAME
                while(p1<N && A[p1]==x) p1++;
                while(p2<N && A[p2]==y) p2++;
            }
            else if(diff<B){
                p2++;
            }
            else{
                p1++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int A[]={0,4,8,12,16,20};
        System.out.println(countPairs(A, 4));
        
    }
}
