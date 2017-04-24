public class LinkedList{
  public Node head;
  public int size;
  
  public boolean isEmpty(){
    return (head == null);
  }
  
  public void add(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;
  }
  
  public Node delete(int data){
    Node temp = head;
    head = head.next;
    return temp;
  }

  public void print(){
    System.out.print("List of Random Numbers: \n");
    Node current = head;
    while(current != null){
      current.printingFormat();
      current = current.next;
    }
    System.out.println("\n");
  }
  
  
  public void bubbleSort(){
    if (size > 1) {
      for (int i = 0; i < size; i++ ) {
        Node currentNode = head;
        Node next = head.next;
        for (int j = 0; j < size - 1; j++) {
          if (currentNode.data > next.data) {
            int temp = currentNode.data;
                    currentNode.data = next.data;
                    next.data = temp;
          } 
          currentNode = next;
          next = next.next;                   
        } 
      }
    }
  }
  
  public int listSize(){     
    return size;
  }
  
}