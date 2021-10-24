package com.mycompany.ict133r_q4;

public class Sorting {

	public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int g = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > g) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = g;
            }
	}

	public static void bubbleSort(int arr[]) {

		for (int i=0;i<arr.length-1;++i){

            for(int j=0;j<arr.length-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
    }

	public static void display(int arr[], String text){
            System.out.println(text);
            for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
        }

	public static void main(String[] argc) {
	
            int myarray1[] = {56, 45, 12, 37, 73, 60};
            int myarray2[] = {34, 12, 90, 87, 24, 56};

            display(myarray1, "Before sort with insertion sort");
            insertionSort(myarray1);
                
            System.out.println("");
		
            display(myarray1, "After sort with insertion sort");
                
            System.out.println("");

            display(myarray2, "Before sort with bubble sort");
            bubbleSort(myarray2);
                
            System.out.println("");
            display(myarray2, "After sort with bubble sort");    
	}
}