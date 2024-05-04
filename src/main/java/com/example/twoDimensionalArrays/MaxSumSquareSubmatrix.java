package com.example.twoDimensionalArrays;
// Given a 2D integer matrix A of size N x N, 
//find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.
public static int findSum(int A[][],int B){
    int N=A.length;
    int slideMatrix[][]=new int[N-B+1][N-B+1];
    //USE 2D SLIDING WINDOW, FIRST COLWISE THEN ROWWISE
    int i,j;
    for(j=0;j<N;j++){
        int sum=0;
        for(i=0;i<B;i++){
            sum+=A[i][j];
        }
        slideMatrix[0][j]=sum;
    }
    for(j=0;j<N;j++){
        for(;i<)
    }



} 
public class MaxSumSquareSubmatrix {
    
}
