package com.example.twoDimensionalArrays;
// Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].

// It is allowed to swap any two elements (not necessarily consecutive).

// Find the minimum number of swaps required to sort the array in ascending order.
public class MinSwaps2 {
    public static int findMin(int A[]){
        int ans=0;
        //LOGIC USED
        // TRY TO MAKE EVERY INDEX VALUE EQUAL TO INDEX ITSELF
        for(int i=0;i<A.length;i++){
            while(A[i]!=i){
                int val=A[i];
                int temp=A[i];
                A[i]=A[val];
                A[val]=temp;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[]={2,0,1,3};
        System.out.println(findMin(ans));
        
    }
}
