package com.bridgl.abz;

public class LargestNumber {
    public static void main(String[] args) {
        int [] arr={1,5,9,8,7,10};
        int largest=arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println (largest);
    }
}
