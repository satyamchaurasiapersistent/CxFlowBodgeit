package com.coding.google;

public class SwapNoTemp {

    public static void main(String[] args){
        int a=1;
        int b=2;

        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);

        a+=b-(b=a);

        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);


    }

}
