package com.example.TwoPointers;

// Given a sorted array of integers (not necessarily distinct) A and an integer B, 
//find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
// Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).

public class PairsSum {
    public static int countPairs(int A[],int B){
        int N=A.length;
        int p1=0; int p2=N-1; int count=0;
        while(p1<p2){
            int sum=A[p1]+A[p2];
            if(sum<B){
                p1++;
            }
            else if(sum>B){
                p2--;
            }
            else{
                if(A[p1]==A[p2]){
                    int x=p2-p1+1;
                    count=count+(x*(x-1))/2;
                    break;
                }
                else{
                    int count1=0; int count2=0;
                    int x=A[p1]; int y=A[p2];
                    while(p1<N && A[p1]==x){
                        count1++;
                        p1++;
                    }
                    while(p2>=0 && A[p2]==y){
                        count2++;
                        p2--;
                    }
                    count=count+(count1*count2);
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int A[]={1,1,1};
        System.out.println(countPairs(A, 2));
        
    }
}
