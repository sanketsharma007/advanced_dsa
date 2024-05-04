package com.example.twoDimensionalArrays;

public class SumAllSubmatrices {
    
    //USING CONTRIBUTION TECHNIQUE
    public static int Sum(int A[][]){
        int ans=0;
        int nRows=A.length;
        int nCols=A[0].length;
        for(int i=0;i<nRows;i++){
            for(int j=0;j<nCols;j++){
                int freq=(i+1)*(j+1)*(nRows-i)*(nCols-j);
                ans+=freq*A[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int A[][]={{1,2},{3,4}};
        System.out.println(Sum(A));
    }
}
