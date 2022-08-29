class Main {
  public static void main(String[] args) {

    DoubleLinkedList dll = new DoubleLinkedList(); 
    dll.addFirst(new Node(10)); 
    dll.addLast(new Node(5));
    dll.addFirst(new Node(12));
    dll.addFirst(new Node(13));
    dll.addLast(new Node(15));

    Node a = dll.search(12);
    System.out.println("el node es: "+ a.getValue());
    System.out.println("el anterior es: "+a.getPrevious().getValue());
    System.out.println("el siguiente es: "+a.getNext().getValue());

	//le faltaba un asterisco
    dll.print(); 
    System.out.println("**********");
    dll.delete(13);
    dll.print();

    System.out.println("**********");
    dll.delete(15);
    dll.print();

    System.out.println("*********");
    dll.delete(10);
    dll.print();

  }
}