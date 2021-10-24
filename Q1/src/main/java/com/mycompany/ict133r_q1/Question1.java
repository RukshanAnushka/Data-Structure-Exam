package com.mycompany.ict133r_q1;

import java.util.Scanner;
import java.util.Arrays;

public class Question1 {

    
    public static void search(int n,int a[]){
    int x,key=0 ,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("searching and find player number: ");
    x=sc.nextInt();

    for(i=0;i<n;i++){
        if(a[i]==x){
        key=1;
        break;
        }
        else{
        key=0;
        }

    }
        if(key==1){
        System.out.println("Element found in index:"+(i));
        }
        else{
        System.out.println("Element not found");
        }
    }

    public static void insert(int a[],int n){
    int index ,x;
    Scanner s=new Scanner(System.in);

    System.out.println("Enter possition you want to insert the element");
    index=s.nextInt();

    System.out.println("Enter the element you want to insert");
    x=s.nextInt();

    for(int i=a.length-1; i > index; i--){
        a[i] = a[i-1];
        }
        a[index] = x;
        System.out.println("New Array: "+Arrays.toString(a));

    }

    public static void delete(int a[],int n){
    int i,index;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the student number wants to be delete: ");
    index=sc.nextInt();

    for(i=index;i<n-1;i++){
        a[i]=a[i+1];
        }

    n=n-1;
    System.out.println("After deletion: ");

    for(i=0;i<n;i++){

        System.out.println("a["+i+"]"+a[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int n=5,i;
        Scanner sc=new Scanner(System.in);

        int[] arr = {89, 70, 34, 45, 63};

        search(n,arr);
        insert(arr,n);
        delete(arr,n);
    }
}