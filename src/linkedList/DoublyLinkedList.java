package linkedList;

public class DoublyLinkedList {

  private Node head;
  private Node tail;
  private int length;


  public class Node{
    private int data;
    private Node previous;
    private Node next;

    public Node(int data){
      this.data = data;
    }
  }

  public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public boolean isEmpty(){
    return length == 0;
  }

  public int length(){
    return length;
  }

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

  }
}



