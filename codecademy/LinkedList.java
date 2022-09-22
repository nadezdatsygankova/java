public class Node {

  public String data;
  private Node next;

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public Node getNextNode() {
    return this.next;
  }

}


public class LinkedList {
public Node head;

public LinkedList(){
this.head = null;
}
public void addToHead(String data){
  Node newHead = new Node(data);
  Node currentHead = this.head;
  this.head = newHead;
  if(currentHead!=null){
     newHead.setNextNode(currentHead);
  }
}
  
   public void addToTail(String data){
    Node tail = head;
    if(tail==null){
      head = new Node(data);
    }else{
      while(tail.getNextNode()!=null){
        tail=tail.getNextNode();
      }
      tail.setNextNode(new Node(data));
    }
  }
  
    public String removeHead(){
    Node removedHead = head;
    if(removedHead == null){
        return null;
    }
    head = removedHead.getNextNode();
    return removedHead.data;
   
  }
  
   public String printList(){
    String output ="<head> ";
    Node currentNode = head;
    while(currentNode!=null){
      output +=currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output+="<tail>";
    System.out.println(output);
    return output;
  }

  public static void main(String []args) {
    LinkedList seasons = new LinkedList();
     seasons.printList();
     seasons.addToHead("summer");
     seasons.addToHead("spring");
     seasons.printList();
     seasons.addToTail("fall");
     seasons.addToTail("winter");
     seasons.printList();
     seasons.removeHead();
     seasons.printList();
  }

}
