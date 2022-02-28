/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
 	// Your code here	
	  Node curr = head;
	  while(curr!=null){
	      Node temp = curr;
	      while(temp!=null && temp.data==curr.data){
	          temp = temp.next;
	      }
	      curr.next=temp;
	      curr = temp;
	  }
	   return head;
    }
}
