/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.linked.list;
import java.util.Scanner;

/**
 *
 * @author rawda
 */
public class CircularLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       LinkedList List=new LinkedList();
       if(List.isEmpty()){
           System.out.println("the list is Empty");
       
       }
         int item;
       System.out.println("Enter item to insert in the list");
        item=input.nextInt();
        List.insertBegin(item);
              //List.Display();
               System.out.println("Enter item to insert in the list");
        item=input.nextInt();
        List.insertBegin(item);
        System.out.println("Enter item to insert in the list");
        item=input.nextInt();
        List.insertBegin(item);
               List.Display();
           System.out.println("Enter item to insert in the list");
        item=input.nextInt();
        List.insertlast(item);
               List.Display(); 
          System.out.println("Enter item to insert in the list");
        item=input.nextInt();
        List.insertlast(item);
               List.Display();
//                 List.DeleteLast();
//               List.Display();
//                 List.DeleteLast();
//               List.Display();
//                 List.DeleteLast();
//               List.Display();
//                 List.DeleteLast();
//               List.Display();
//                 List.DeleteLast();
//               List.Display();
               List.DeleteFirst();
               List.Display();
                List.DeleteFirst();
               List.Display();

    }
    
}
