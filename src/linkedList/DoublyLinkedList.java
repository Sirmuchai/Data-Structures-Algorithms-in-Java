package linkedList;

import java.util.NoSuchElementException;

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
      newNode.previous = tail;
    }
    tail = newNode;
    length++;
  }

  //Insert at the start of a DLL
  public void insertStart(int data){
    Node newNode = new Node(data);
    //check if the list is empty
    if(isEmpty()){
      tail = newNode;
    }
    else{
      head.previous = newNode;
      newNode.next =head ;
    }
    head = newNode;
    length++;
  }

  //Print List forward
  public void printForward(){
    if(head == null){
      return;
    }
    Node current = head;
    while (current != null){
      System.out.print(current.data + " <--> ");
      current = current.next;
    }
    System.out.print("NULL");
  }

  //Delete first value in a DLL
  public Node deleteFirst(){
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    Node current = head;
    if(head == tail){
      tail = null;
    }else{
      head.next.previous = null;
    }
    head = head.next;
    current.next = null;
    return current;
  }


}



