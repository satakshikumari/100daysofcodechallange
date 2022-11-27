/*DOUBLY LINKED LIST

CODE- */

import java.util.*;
import java.util.Scanner;
public class DoublyLinkedList {
    //Create a node
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
       public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
         public Node() {       
            this.next = null; 
            this.prev=null;   
        }    
    }

    // Insertion at beginning

    public void addBeg(int data){
        Node ptr= new Node(data);
        if(head==null){
            head= ptr;
            return;
        }
        ptr.next = head;
        head=ptr;
    }

    // Insertion at end

    public void addEnd(int data){
        Node ptr= new Node(data);
        if(head==null){
            head= ptr;
            return;
        }
        Node temp=head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next=ptr;
        ptr.prev=temp;
    }

    // Insertion after specific pos

    public void addSpec(int data, int loc){  
       Node ptr = new Node(data);    
            
       //Checks if the list is empty    
       if(head == null) {     
           head = ptr; 
       }    
       else { 
           Node ptr1 = head;
           int i=1;
           while(i<loc){
               ptr1=ptr1.next;
               i++;
              
           if(ptr1==null){
               System.out.println("Cannot Insert...");
               return;
        }
    }
       
           if(ptr1.next == null){
               ptr1.next=ptr;
               ptr.prev=ptr1;
           }
           
           else{
               ptr.next=ptr1.next;
               ptr.prev=ptr1;
               ptr1.next.prev=ptr;
               ptr1.next=ptr;
           }
       }    
        }
    
        // Delete from first pos

        public void delFirst(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            head=head.next;
            head.prev=null;
        }

        // Delete from last pos

        public void delLast(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            else if(head.next==null){
                head=null;
                return;
            }

        Node ptr=head.next;
        Node ptr2=head;
        while(ptr.next!=null){

            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        ptr2.next=null; 
        
        }
          // Delete from a specific position
  
        public void delSpec(int pos) {   
          
            //Checks if the list is empty    
            if(head == null) {      
                System.out.println("Empty List");  
            } 
            else {   
                Node ptr=head;
                int i=1;
                Node ptr1=new Node();
                while(i<pos){
                    ptr1=ptr;
                    ptr=ptr.next;
                
                
                if(ptr==null){
                    System.out.println("Cannot Delete...");
                    return;
                }
                i++;
            }
    
                if(ptr==head){
                    head=head.next;
                    ptr=null;
                }
                else{
                    ptr.next.prev=ptr1;
                    ptr1.next=ptr.next;
                    ptr=null;
                }
                
            }    
        }
  
  // Display elements
  
        public void display(){
            if(head==null){
                System.out.println("Empty List ");
                return;
            }
            Node ptr=head;
            while(ptr != null){
                System.out.print(ptr.data+ "-->");
                ptr=ptr.next;    
            }
            System.out.println("NULL"); 
        }


        public static void main(String[] args) {    
            
            DoublyLinkedList s = new DoublyLinkedList();    
            Scanner sc=new Scanner(System.in);
    
            int flag=0;
            while(flag==0){
                System.out.println("1.Insertion at begining");
                System.out.println("2.Insertion at end");
                System.out.println("3.Insertion after given position");
                System.out.println("4.Deletion from begining");
                System.out.println("5.Deletion from end");
                System.out.println("6.Deletion from given position");
                System.out.println("7.Display");
                System.out.println("8.Exit");
                int ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to be inserted-");
                        s.addBeg(sc.nextInt());
                        break;
    
                    case 2:
                        System.out.println("Enter the element to be inserted-");
                        s.addEnd(sc.nextInt());
                        break;
    
                    case 3:
                        System.out.println("Enter the element to be inserted and after postion-");
                        s.addSpec(sc.nextInt(), sc.nextInt() );
                        break;
                    case 4:
                        s.delFirst();
                        break;
                    case 5:
                        s.delLast();
                        break;
                    case 6:
                        System.out.println("Enter postion from where element is to be deleted-");
                        s.delSpec(sc.nextInt());
                        break;
                    case 7:
                    System.out.println("Elements in list");
                        s.display();
                        break;
                    case 8:
                        flag=1;
                        break;
                    default:System.out.println("Wrong Input!!");
                        break;
                } 
            }  
        }
    }

    

/*Output

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
1
Enter the element to be inserted-
11

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
2
Enter the element to be inserted-
22

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
3
Enter the element to be inserted and after postion-
33
2

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
3
Enter the element to be inserted and after postion-
5
5
Cannot Insert...

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
7
Elements in list
11-->22-->33-->NULL

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
4

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
7
Elements in list
22-->33-->NULL

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
5

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
7
Elements in list
22-->NULL

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
1
Enter the element to be inserted-
55

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
7
Elements in list
55-->22-->NULL

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
6
Enter postion from where element is to be deleted-
1

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
7
Elements in list
22-->NULL

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
6
Enter postion from where element is to be deleted-
7
Cannot Delete...

1.Insertion at begining
2.Insertion at end
3.Insertion after given position
4.Deletion from begining
5.Deletion from end
6.Deletion from given position
7.Display
8.Exit
*/

