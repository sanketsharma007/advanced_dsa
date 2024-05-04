package com.example.InterviewProblems;

// Given an unsorted integer array, A of size N. Find the first missing positive integer.
// Note: Your algorithm should run in O(n) time and use constant space.

public class NextPermutation {
    public static void reverse(int A[],int s1,int e1){
        int s=s1; int e=e1;
        while(s<e){
            int temp=A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
        }
        return;
    }
    public static int[] nextPermute(int A[]){
        int N=A.length;
        //TRAVERSE FROM RIGHT AND FIND IF A[i]<A[i+1]
        int x=0,xIndex=0,i;
        for(i=N-2;i>=0;i--){
            if(A[i]<A[i+1]){
                x=A[i];
                xIndex=i;
                break;
            }
        }
        if(i<0){
            reverse(A,0,N-1);
            return A;
        }
        //FIND THE INDEX A[i]>X
        for(i=N-1;i>xIndex;i--){
            if(A[i]>x){
                int temp=A[i];
                A[i]=A[xIndex];
                A[xIndex]=temp;
                break;
            }
        }
        //REVERSE THE SEQUENCE STARTING FROM xIndex+1
        int s=xIndex+1;
        int e=A.length-1;
        reverse(A,s,e);
        return A;

    } 
    public static void main(String[] args) {
        int A[]={3,2,1};
        int ans[]=nextPermute(A);
        for(int i=0;i<A.length;i++){
            System.out.println(ans[i]);
        }
    }
    
}
