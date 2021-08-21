package com.google;
/*
Author: Sonal
code for method overloading and overriding
* */

public class Java22 {

    public static void main(String[] args) {
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Multiplication mul=new Multiplication();
        Division div=new Division();

        System.out.println("Sum: "+add.result(1,2));
        System.out.println("Sum: "+add.result(1,2,5));
        System.out.println("Sum: "+add.result(1,2,9,6));

        System.out.println("Subtraction: "+sum.result(10,2));
        System.out.println("Subtraction:  "+sum.result(50,20,5));
        System.out.println("Subtraction: "+sum.result(77,26,19,4));

        System.out.println("Multiplication: "+mul.result(90,2));
        System.out.println("Multiplication: "+mul.result(12,2,4));
        System.out.println("Multiplication: "+mul.result(12,2,4,7));

        System.out.println("Division: "+div.result(12,2));



    }//main method ends

}//JPR22 ends


class Addition{
    //method overloading
    int result(int a,int b){
        return a+b;
    }
    int result(int a,int b,int c){
        return a+b+c;
    }
    int result(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

class Subtraction extends Addition{
    //method overriding
    int result(int a,int b){
        return a-b;
    }
    int result(int a,int b,int c){
        return a-b-c;
    }
    int result(int a,int b,int c,int d){
        return a-b-c-d;
    }
}
class Multiplication extends Addition{
    //method overriding
    int result(int a,int b){
        return a*b;
    }
    int result(int a,int b,int c){
        return a*b*c;
    }
    int result(int a,int b,int c,int d){
        return a*b*c*d;
    }
}
class Division extends Addition{
    //method overriding
    int result(int a,int b){
        return a/b;
    }

}



   










