package linkedList;

public class DoublyLinkedList {

  private Node head;
  private Node tail;
  private int length;


  private class Node{
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

  // Method to check if the list empty
  public boolean isEmpty(){
    return length == 0;
  }

  // Method to return lenfth of our linked list
  public int length(){
    return length;
  }

  // Inserting data to a doubly linked list
  public void insertLast(int data){
    Node newNode = new Node(data);
    //checks if the list is empty
    if(isEmpty()){
      head = newNode;
    }else{
      tail.next = newNode;
    }
    newNode.previous = tail;
    tail = newNode;
    length++;
  }

  //Print List forward

  public void printForward(){
    if(head == null){
      return;
    }
    Node current = head;
    while (current != null){
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.print("NULL");
  }






}


