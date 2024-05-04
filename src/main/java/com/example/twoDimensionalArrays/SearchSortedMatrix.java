package com.example.twoDimensionalArrays;
// Given a matrix of integers A of size N x M and an integer B.
// In the given matrix every row and column is sorted in non-decreasing order. 
// Find and return the position of B in the matrix in the given form:
// If A[i][j] = B then return (i * 1009 + j)
// If B is not present return -1.
public class SearchSortedMatrix {
    public static int findNo(int A[][],int B){
        int nRows=A.length;
        int nCols=A[0].length;
        int i=0;
        int j=nCols-1;
        int ans=Integer.MAX_VALUE;
        while(i<nRows && j>=0){
            //ELEMENT FOUND UPDATE AND GO LEFT
            if(A[i][j]==B){
                ans=Math.min(ans, (i+1)*1009+j+1);
                j--;
            }
            //GO LEFT
            else if(A[i][j]>B){
                j--;
            }
            //GO RIGHT
            else{
                i++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int A[][]={{1,2},{3,3}};
        System.out.println(findNo(A, 3));
    }
}
