package com.mycompany.ict133r_q2;

public class Stack {
    private int maxSize; 
    private int[] stackData; 
    private int top; 

    public Stack(int s){
        top =-1;
        maxSize = s;
        stackData =new int [maxSize];
    }
        
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void push (int j)
    {
        if(isFull())
        {
            System.out.println("push failed!, Stack is overflow");
        } else {
            top = top+1;
            stackData[top] = j;
            System.out.println(j+" is pushed to stack");
        }
    }

    public void pop(){
        int removedItem;
        if(isEmpty()){
            System.out.println("pop failed!, Stack is underflow");
        }
        else{
            removedItem = stackData[top];
            top=top-1;
            System.out.println("Stack top value " + removedItem + " has been removed");
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("peek failed!, Stack is underflow");
        }
        else{
            System.out.println("Current stack top is " + stackData[top]);
        }
        
    }

    public void display(){
        System.out.println("--- Stack info ---");
        System.out.println("Stack size " + stackData.length); 
        System.out.println("Stack top " + top);
        System.out.println("--- Stack contents ---");

        for(int i=top;i>=0;i--){
            System.out.print(stackData[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack stack=new Stack(8);
        
        stack.push(12);
        stack.push(47);
        stack.push(56);
        stack.push(88);
        
        System.out.println(" ");

        stack.pop();      //pop value 88
        stack.pop();      //pop value 56 
        //stack.display();
        
        System.out.println(" ");
        
        stack.peek();
        
        stack.push(21);
        stack.push(35);
        stack.peek();
        
        System.out.println(" ");
        
        stack.pop();
        //stack.display();
        
        System.out.println(" ");


        stack.push(4);
        stack.push(6);
        stack.push(10);
        stack.push(76);
        stack.push(98);
        stack.push(21);
        stack.push(32);
        
        System.out.println(" ");
        
        stack.display();
        
    }
}