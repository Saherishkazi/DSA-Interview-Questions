public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data =data;
            this.next =null;
            this.prev =prev;
        }
        }
        public static Node head;
        public static Node tail;
        public static int size;
        
        //add
        public void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head =tail =newNode;
                return;
            }
            newNode.next =head;  //new node ka next point to head->
            head.prev =newNode;  //head ke prev me dalo new node
            head = newNode; //
        }

public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
            dll.addfirst(3);
            dll.addfirst(2);
            dll.addfirst(1);
          
            dll.print();
        System.out.println(dll.size);
