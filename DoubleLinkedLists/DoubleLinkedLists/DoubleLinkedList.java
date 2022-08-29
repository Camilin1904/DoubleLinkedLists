
public class DoubleLinkedList{

  private Node head;

  private Node tail; 

  public void addLast(Node node){
    if (head == null){
      this.head = node;
      this.tail = node;
      
    }
    else {
      this.tail.setNext(node);
      node.setPrevious(this.tail);
      this.tail = node;
      
    }
  }

  public void addFirst(Node node){
    if(this.head == null){
      this.head = node; 
      this.tail = node;
    }
    else{
      node.setNext(this.head);
      this.head.setPrevious(node);
      this.head = node; 
    }
  }

  public void print(){
    print(head);
  }

  private void print(Node current){
    if(current == null){
      return; 
    }
    System.out.println(current.getValue());
    print(current.getNext());
  }

  public Node search(int goal){
    return search(goal, head);
  }

  private Node search(int goal, Node current){
    if(current == null){
      return null;
    }
    if(current.getValue() == goal ){
      return current;
    }
    return search(goal, current.getNext());
  }
  
  public void delete(int goal){
    delete( goal, null, head);
  }

  private void delete(int goal, Node previous, Node current){
    if(current == null){
      return;
    }

    if(head.getValue() == goal){
      current.getNext().setPrevious(null);
      this.head = current.getNext();
      current.setNext(null); 
      return;
    }

    if(tail.getValue() == goal && tail == current){
      previous.setNext(null);
      this.tail = previous;
      return;
    }

    if(current.getValue() == goal){
      previous.setNext(current.getNext());
      
      return;
    }
    delete(goal, current, current.getNext());
  }


  
}