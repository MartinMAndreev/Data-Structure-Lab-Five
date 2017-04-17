class Main
   {
   public static void main(String[] args)
      {                             // make a new list
      DoublyLinkedList theList = new DoublyLinkedList();

      theList.insertFirst(12);      // insert at front
      theList.insertFirst(32);
      theList.insertFirst(23);

      theList.insertLast(51);       // insert at rear
      theList.insertLast(11);
      theList.insertLast(2);

      theList.displayForward();     // display list forward
      theList.displayBackward();    // display list backward

      theList.deleteFirst();        // delete first item
      theList.deleteLast();         // delete last item
      theList.deleteKey(11);        // delete item with key 11

      theList.displayForward();     // display list forward

      theList.insertAfter(12, 42);  // insert 77 after 22
      theList.insertAfter(23, 63);  // insert 88 after 33

      theList.displayForward();
   }
}