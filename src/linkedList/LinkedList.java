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

  public static void main(String[] args) {
    //Single LinkedList
    LinkedList singleLinkedList = new LinkedList();

    singleLinkedList.head = new ListNode(13);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(5);
    ListNode fourth = new ListNode(3);

    singleLinkedList.head = second;
    second.next = third;
    third.next = fourth;

  }


}
