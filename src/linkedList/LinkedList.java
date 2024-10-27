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
    if(current == null){
      return false;
    }
    while(current != null){
      if(data == current.data){
        return true;
      }
      current = current.next;
    }
    return false;

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
    System.out.println(singleLinkedList.search(singleLinkedList.head, 50));

  }


}
