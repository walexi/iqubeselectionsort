/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author walexi4great
 */

public class SelectionSort {
    public int arraySize;
    public int[] arrayValue;
    public SelectionSort() {
         arrayValue = new int[50];
         arraySize = 10;
    
    }
    
    public void generateArray(){
        for(int i =0; i<arraySize; i++){
            arrayValue[i] = (int)(Math.random()*10 + 10);
        }
    }
    private void printHorzArray(int i, int j) {
        for(int n=0;n<51;n++)
            System.out.print("-");
             System.out.println();
        
        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }
            System.out.println("|");

        for (int n = 0; n < 51; n++) 
            System.out.print("-");
        
        
        System.out.println();
         for (int n = 0; n <arraySize; n++) {
            System.out.print("| " + arrayValue[n] + " ");
        }
                   System.out.println("|");
        for (int n = 0; n < 51; n++) 
            System.out.print("-");
        
        
        System.out.println();

        if(j != -1){
            for (int k = 0; k < ((j*5)+2); k++) 
                System.out.println(" ");
                 System.out.print(j);
            
        }
        if(i != -1){
            for(int l = 0; l<(5*(i-j)-1);l++)
            System.out.print(" ");
             System.out.print(i);
        }
        
            System.out.println();
        }
    
    public void SelectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = minimum; j < arraySize; j++) {
               if(arrayValue[minimum]> arrayValue[j])
                   minimum = j;
            }
        
        swap(i, minimum);
            printHorzArray(i, -1);
    }
        
    }
    public void swap(int i, int j){
        
            int temp = arrayValue[i];
            arrayValue[i] = arrayValue[j];
            arrayValue[j] = temp;
       
    }
    
    public static void main(String [] args){
        SelectionSort testsort = new SelectionSort();
        testsort.generateArray();
        testsort.SelectionSort();
    }
    
    
}
