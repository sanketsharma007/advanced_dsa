package com.example.bitManipulation;

public class MaxANDPair {
    public static int findMaxPair(int A[]){
        double ans=0;
        for(int i=31;i>=0;i--){
            int sum=0;
            //FOR EACH BIT CALCULATE THE SUM OF THAT BIT
            for(int j=0;j<A.length;j++){
                if((A[j]&(1<<i))>0){
                    sum++;
                }
            }
            if(sum>=2){
                ans=ans+(1<<i);
            
                for(int j=0;j<A.length;j++){
                    if((A[j]&(1<<i))==0){
                        A[j]=0;
                    }
                }
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int A[]={53,39,88};
        System.out.println(findMaxPair(A));
        
    }
}
