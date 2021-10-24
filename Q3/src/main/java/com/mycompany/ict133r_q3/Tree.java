package com.mycompany.ict133r_q3;

public class Tree {

        public Node AddNode(int data)
    {
        Node new_node=new Node(data); 
        return new_node;
    }

        public Node FindNode(Node node,int data)
    {
        if(node==null)
        {
            System.out.println("The node is not in the tree");
            return null;
        }
        else if(node.data == data)
        {
            System.out.println("Node is in the tree");
            return node;
        }
        else if(node.data<data)
        {
            return FindNode(node.right,data);
        }
        else
        {
            return FindNode(node.right,data);
        }
    }

  
    public void inorder(Node root)
    {
        if (root==null)
        {
            return;
        }
        else
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
     
    public void preorder(Node root)
    {
         if (root==null) 
         {
             return;
         }
         else  
         {
             System.out.print(root.data+" ");
             preorder(root.left);
             preorder(root.right);
         }
    }  
    
    public void postorder(Node root)
    {
         if (root==null) 
         {
             return;
         }
         else  
         {
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data+" ");
         }
    } 
    

    public static void main(String[] args) {
    
         Tree tr =new Tree();
         Node root=tr.AddNode(60);
         root.left=tr.AddNode(70);
         root.right=tr.AddNode(45);
         root.left.left=tr.AddNode(3);
         root.left.right=tr.AddNode(80);
         root.right.left=tr.AddNode(110);
         root.right.right=tr.AddNode(25);
         
         
         System.out.println("Inorder method: ");
         tr.inorder(root);
         System.out.println();
         
         System.out.println("preorder method: ");
         tr.preorder(root);
         System.out.println();
         
         System.out.println("postorder method: ");
         tr.postorder(root);
         System.out.println();
         
        
        tr.FindNode(root, 45);
  

    }

}