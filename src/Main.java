import linkedList.DoublyLinkedList;

public class Main {
  public static void main(String[] args) {

    //Initialized a double linked list
    DoublyLinkedList dll = new DoublyLinkedList();

    //Print  the length linked List
    System.out.println(dll.length());

    // Checking if the linked list is empty
    System.out.println("Linked list is empty? "+ dll.isEmpty());

  }
}
