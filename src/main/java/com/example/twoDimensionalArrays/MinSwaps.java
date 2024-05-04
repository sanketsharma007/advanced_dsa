package com.example.twoDimensionalArrays;
// Given an array of integers A and an integer B,
// find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
public class MinSwaps {
    //FIND THE WINDOW WITH THE LEAST NO OF BadNOs
    public static int solve(int A[],int B){
        int badNos=0; int N=A.length;
        for(int i=0;i<N;i++){
            if(A[i]<B){
                badNos++;
            }
        }
        int MinBad=Integer.MAX_VALUE;
        int currBad=0;
        int i;
        for(i=0;i<badNos;i++){
            if(A[i]>B){
                currBad++;
            }
        }
        MinBad=Math.min(MinBad, currBad);
        for(;i<N;i++){
            if(A[i]>B){
                currBad++;
            }
            if(A[i-badNos]>B){
                currBad--;
            }
            MinBad=Math.min(currBad,MinBad);
        }
        return MinBad;

    }
  public static void main(String[] args) {
    int A[]={5,17,100,11};
    int B=8;
    System.out.println(solve(A, B));
    
  }  
}
