package com.example.binarySearchOnArray;

import java.util.Arrays;

// You are given a 2-D matrix C of size A × B.
// You need to build a new 1-D array of size A by taking one element from each row of the 
// 2-D matrix in such a way that the cost of the newly built array is minimized.
// The cost of an array is the minimum possible value of the absolute difference between any two adjacent elements of the array.
// So if the newly built array is X, the element picked from row 1 will become X[1], 
// element picked from row 2 will become X[2], and so on.
// Determine the minimum cost of the newly built array.
public class MinimumDifference {
    public static int minDiff(int A[][]){
        //SORT EACH ROW
        int nrows=A.length; int ncols=A[0].length;
        for(int i=0;i<nrows;i++){
            Arrays.sort(A[i]);
        }
        //FOR EACH ROW WE ARE FINDING THE MIN DIFFERENCE OF THAT ROW WITH THE NEXT ROW ELEMENTS USING BINARY SEARCH
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nrows-1;i++){
            for(int j=0;j<ncols;j++){
                int s=0; int e=ncols-1;
                while(s<e){
                    int mid=s+(e-s)/2;
                    if(A[i][j]==A[i+1][mid]){
                        return 0;
                    }
                    else if(A[i][j]>A[i+1][mid]){
                        s=mid+1;
                    }
                    else{
                        e=-mid-1;
                    }
                }
                if(s<ncols){
                    ans=Math.min(ans, Math.abs(A[i+1][s]-A[i][j]));
                }
                if(e>=0){
                    ans=Math.min(ans, Math.abs(A[i+1][e]-A[i][j]));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int A[][]={{7,3},{2,1},{4,9}};
        System.out.println(minDiff(A));
        
    }
    
}
