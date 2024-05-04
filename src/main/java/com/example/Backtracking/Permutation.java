package com.example.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

    public static void permute(ArrayList<Character> A,int i){
        //BASE CASE
        if(i==A.size()){
            System.out.println(A);
            return;
        }
        //REC CASE
        for(int j=i;j<A.size();j++){
            Collections.swap(A,i,j);
            permute(A, i+1);
            Collections.swap(A,i,j);
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Character> al1=new ArrayList<>();
        al1.add('a');
        al1.add('b');
        al1.add('c');
        permute(al1,0);
        
    }
    
}
