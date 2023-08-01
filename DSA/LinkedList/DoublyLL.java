public class DoublyLL {
    public class Node{
    int data;
    Node next;
    Node prev;
    
    public Node(int data){
        this.data=data;
        this.next = null;
        this.prev=null;
    }
}
public static Node head;
public static Node tail;
public static int size;

//add first
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
        head = tail = newNode;
        return;
    }
    newNode.next =head;
    head.prev = newNode;
    head = newNode;
}
//remove first
public int removeFirst(){
    if(head==null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val = head.data;
        head = tail=null;
        size--;
        return val;
    }
    int val = head.data;
    head = head.next;
    head.prev=null;
    size--;
    return val;
}
public void print(){
    Node temp = head;
    while(temp!=null){
        System.err.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}

public void reverse(){
    Node curr = head;
    Node prev = null;
    Node next;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;

        prev = curr;
        curr = next;

    }
    head = prev;
}
public void addLast(int data){
    Node newNode = new Node(data);
     if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail = newNode;
    size++;
}
public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val = head.data;
        head=tail=null;
        size =0;
        return val;
    }
    Node prev = head;
    for (int i = 0; i < size-1; i++) {
        prev=prev.next;
        
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}

public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.addLast(4);
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.print();
    // System.out.println(dll.size);
    // dll.removeFirst();
    dll.removeLast();
    dll.print();
    // System.out.println(dll.size);

}
}
