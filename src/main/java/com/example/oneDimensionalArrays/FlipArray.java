package com.example.oneDimensionalArrays;
// You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. 
// In a single operation, you can choose two indices,
// L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. 
// By flipping, we mean changing character 0 to 1 and vice-versa.
// Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.
// If you don't want to perform the operation, return an empty array. 
// Else, return an array consisting of two elements denoting L and R. 
// If there are multiple solutions, return the lexicographically smallest pair of L and R
public class FlipArray {
    public static int[] flipArray(int A[]){
        //FOR EVERY ZERO, GOTO LEFT AND RIGHT WHILE A[i]==0 AND UPDATE ACCORDINGLY
        int l=-1;
        int r=-1;
        int maxLen=-1;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                int s=i-1; int e=i+1;
                // GOTO LEFT
                while(s>=0 && A[s]==0){
                    A[s]=-1;
                    s--;
                }
                // GOTO RIGHT
                while(e<A.length && A[e]==0){
                    A[e]=-1;
                    e++;
                }
                //UPDATE
                if(e-s-1>maxLen){
                    maxLen=e-s+1;
                    l=s+1;
                    r=e-1;
                }

                A[i]=-1;
            }
        }
        int ans[]=new int[2];
        ans[0]=l;
        ans[1]=r;
        return ans;



    }
    public static void main(String[] args) {
        int A[]={0,1,0};
        int ans[]=flipArray(A);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
