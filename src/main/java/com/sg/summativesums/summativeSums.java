/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.summativesums;

import java.util.Arrays;

/**
 *
 * @author travi
 */
public class summativeSums {   

    public static void main(String[] args) {
        
        int arr1[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int arr2[] = {999, -60, -77, 14, 160, 301};
        int arr3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99};
        
        
        System.out.print("#1 Array Sum: ");
        sumArr(arr1);
        System.out.print("#2 Array Sum: ");
        sumArr(arr2);
        System.out.print("#3 Array Sum: ");
        sumArr(arr3);
       
    } // -- MAIN METHOD --
    
    
    // -- CREATED METHODS -- 
    public static void sumArr(int[] array) {
        int sum = 0;
        for (int i : array){
            sum += i;
            
        }
        System.out.println(sum); 
            
    }   
    
    
} // -- class summativeSums --
