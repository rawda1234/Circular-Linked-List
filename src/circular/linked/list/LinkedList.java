/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.linked.list;

/**
 *
 * @author rawda
 */
public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }
    public boolean isEmpty(){
    
    return (head==null);
    }
    
    public void insertBegin(int newvalue){
        Node newnode=new Node(newvalue);
        newnode.Data=newvalue;
        if(isEmpty()){
        head=newnode;
        newnode.Next=head;
        }
        else{
        Node temp=head;
        while(temp.Next!=head){
        temp=temp.Next;
        }
        newnode.Next=head;
        head=newnode;
        temp.Next=head;
        }

    }
    public void insertlast(int newvalue){
        Node newnode=new Node(newvalue);
        newnode.Data=newvalue;
        if(isEmpty()){
        head=newnode;
        newnode.Next=head;
        }
        else{
        Node temp=head;
        while(temp.Next!=head){
        temp=temp.Next;
        }
        temp.Next=newnode;
        newnode.Next=head;
        }

    }
public void Display(){ 
    if(isEmpty()){ 
           System.out.println("List is empty, no items to delete"); 
       } 
    else{ 
       Node temp=head;  
       while(true){ 
        System.out.print(temp.Data+" ");
if (temp.Next==head)
    break;
temp=temp.Next; 
       } 
        System.out.println(); 
        
        
    }
}
//    public void DeleteLast(){
//            
//
//       if(isEmpty()){
//           System.out.println("List is empty, no items to delete");
//       }else{
//
//         Node tail=head;// 
//         Node temp=tail.Next;// 
//         if(tail.Next==head){
//             head=null;
//         }else{
//        while(true){ 
//        if (tail.Next!=head)
//        tail=tail.Next; 
//        else
//            break;
//       } 
//        
//        
//        }
//       }
//
//        
//       
//       
//       }
 public void DeleteLast(){
            
         Node delptr=head;// delete lint 

       if(isEmpty()){
           System.out.println("List is empty, no items to delete");
       }
       
        while(delptr.Next.Next!=head){

       delptr=delptr.Next;
        
        }
        delptr.Next=head;

       
       }
 
 public void DeleteFirst(){
       if(isEmpty()){
           System.out.println("List is empty, no items to delete");
       }//delete from first
              Node temp=head;// delete lint 
              while(temp.Next!=head){

                 temp=temp.Next;
        
        }
              head=head.Next;
              temp.Next=head;
 }
}
