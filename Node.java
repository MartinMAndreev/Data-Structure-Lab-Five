public class Node{
  
  public int data;
  public Node next;
  
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  
  public int getData(){
    return this.data;
  }
  
  public Node getNext(){
    return this.next;
  }
  
  public void printingFormat(){
    System.out.print("(" + data + ")");
  }
}