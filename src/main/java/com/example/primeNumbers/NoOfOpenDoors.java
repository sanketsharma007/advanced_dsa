package com.example.primeNumbers;

public class NoOfOpenDoors {
    public static int get_factors(int[] spf,int X){
        int total=1;
        while(X!=1){
            int count=0;
            int p=spf[X];
            while(X%p==0){
                X=X/p;
                count++;
            }
            total*=(count+1);
        }
        
        return total;
    }
    public static int finNo(int A){
        int spf[]=new int[A+1];
        //INTIALISE SPF[i]=i
        for(int i=0;i<=A;i++){
            spf[i]=i;
        }
        //FIND THE SMALLEST PRIME FACTOR FOR EACH NUMBER
        for(int i=2;i<=A;i++){
            if(spf[i]==i){
                for(int j=2*i;j<=A;j+=i){
                    spf[j]=Math.min(spf[j], i);
                }
            }
        }
        //CALCULATE THE NO OF FACTORS FOR EACH NO, IF FACTORS==EVEN DOOR->CLOSED, ELSE OPEN
        int noFactors[]=new int[A+1];
        noFactors[0]=0; noFactors[1]=1;
        for(int i=2;i<=A;i++){
            noFactors[i]=get_factors(spf, i);
        }
        int ans=0;
        for(int i=1;i<=A;i++){
            if(noFactors[i]%2!=0){
                ans++;
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        int A=6;
        System.out.println(finNo(A));
    }
}
