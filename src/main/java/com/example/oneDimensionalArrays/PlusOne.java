package com.example.oneDimensionalArrays;

public class PlusOne {

// Given a non-negative number represented as an array of digits, 
// add 1 to the number ( increment the number represented by the digits ).
// The digits are stored such that the most significant digit is at the head of the list.

    public static int[] plusOne(int A[]){
        int frontZeros=0;
        int N=A.length;
        int i=0;
        while(A[i]==0){
            frontZeros++;
            i++;
        }
        int realLength=N-frontZeros;
        //REVERSE THE INPUT ARRAY
        int s=0; int e=N-1;
        while(s<e){
            int temp=A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
        }
        i=0;
        int carry=1;

        while(i<realLength){
            int sum=A[i]+carry;
            int rem=sum%10;
            carry=sum/10;
            A[i]=rem;
            i++;
        }
        if(carry==1){
            int ans[]=new int[realLength+1];
            for(i=0;i<realLength;i++){
                ans[i]=A[i];
            }
            ans[realLength]=1;
            //REVERSE IT
            s=0; e=realLength;
            while(s<e){
            int temp=A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
            }
            return ans;
        }
        int ans[]=new int[realLength];
        for(i=0;i<realLength;i++){
            ans[i]=A[i];
        }
        //REVERSE IT
        s=0; e=realLength-1;
            while(s<e){
            int temp=A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int A[]={9,9};
        int ans[]=plusOne(A);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
}    
}
