import linkedList.DoublyLinkedList;
import otp.OtpService;

public class Main {
  public static void main(String[] args) {

    //Initialized a double linked list
    DoublyLinkedList dll = new DoublyLinkedList();

    //Print  the length linked List
    System.out.println(dll.length());

    // Checking if the linked list is empty
    System.out.println("Linked list is empty? "+ dll.isEmpty());

    //insert to the list
    dll.insertLast(1);
    dll.insertLast(2);
    dll.insertLast(3);


    //Check lenfth after inserting
    System.out.println(dll.length());

    //print the list forward
    dll.printForward();

    //Insert at the start
    dll.insertStart(0);
    dll.insertStart(-1);
    dll.insertStart(-2);

    //insert to the list
    dll.insertLast(4);

    //print the list forward
    System.out.println();
    dll.printForward();

    //Delete first node
   dll.deleteFirst();
   System.out.println("DLL after deleting node 1" );
   dll.printForward();

    //Delete last node
    dll.deleteLast();
    System.out.println("DLL after deleting last node" );
    dll.printForward();

    OtpService otpService = new OtpService();


    System.out.println("My OTP is: "+ otpService.otpGeneration());


  }
}
