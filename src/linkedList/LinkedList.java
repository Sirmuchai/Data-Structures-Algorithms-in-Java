package linkedList;

public class LinkedList {

  private ListNode head;

  private static class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }

  //Printing a linked List data
  public void printList(ListNode head){
    ListNode current = head;
    while ( current != null){
      System.out.print(current.data + " => ");
      current = current.next;
    }
    System.out.println("Null");
  }

  //Finding Length of a linked list
  public int length(ListNode head){
    ListNode current = head;
    int count =0;
    while(current != null){
        current = current.next;
        count++;
    }
    return count;
  }

  // Searching  if data exist in a linked list
  public boolean search(ListNode node,  int data){
    ListNode current = node;
    while(current != null){
      if(data == current.data){
        return true;
      }
      current = current.next;
    }
    return false;

  }

  //Inserting after a node
  public void insertAfterNode(ListNode node, ListNode newNode){
    if (node == null){
      node = newNode;
    }
    else if(node.next == null){
      node.next = newNode;
    }
    else{
      ListNode temp = node.next;
      newNode.next = temp;
      node.next = newNode;
    }
  }

  public static void main(String[] args) {
    //Single LinkedList
    LinkedList singleLinkedList = new LinkedList();
    LinkedList emptyList = new LinkedList();


    singleLinkedList.head = new ListNode(13);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(5);
    ListNode fourth = new ListNode(3);

    singleLinkedList.head.next = second;
    second.next = third;
    third.next = fourth;


   singleLinkedList.printList(singleLinkedList.head);
   singleLinkedList.printList(emptyList.head);

   System.out.println(singleLinkedList.length(emptyList.head));

   System.out.println(singleLinkedList.search(singleLinkedList.head, 5));
   System.out.println(singleLinkedList.search(emptyList.head, 1));

   ListNode fifth = new ListNode(7);
   ListNode last = new ListNode(23);
   ListNode last1 = new ListNode(23);

   // Insert at the end
   singleLinkedList.insertAfterNode(fourth, last);
   singleLinkedList.printList(singleLinkedList.head);

  // Insert in an empty List
   emptyList.insertAfterNode(emptyList.head, last1);
   emptyList.printList(emptyList.head);

   // Insert after a node
   singleLinkedList.insertAfterNode(second, fifth);
   singleLinkedList.printList(singleLinkedList.head);

  }


}
