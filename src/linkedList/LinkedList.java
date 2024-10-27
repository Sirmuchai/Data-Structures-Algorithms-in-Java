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

  public void printList(ListNode head){
    ListNode current = head;
    while ( current != null){
      System.out.print(current.data + " => ");
      current = current.next;
    }
    System.out.println("Null");
  }

  public static void main(String[] args) {
    //Single LinkedList
    LinkedList singleLinkedList = new LinkedList();

    singleLinkedList.head = new ListNode(13);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(5);
    ListNode fourth = new ListNode(3);

    singleLinkedList.head.next = second;
    second.next = third;
    third.next = fourth;

   singleLinkedList.printList(singleLinkedList.head);

  }


}
