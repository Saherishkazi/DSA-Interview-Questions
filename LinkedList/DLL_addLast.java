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


public void addLast(int data){
            Node newNode =new Node(data);
            size++;
            if(head == null){
                head =tail=newNode;
                return;
            }
           tail.next =newNode;//tail ke next me add kro newNode
          newNode.prev = tail; //newNode ka previous me tail
            tail =newNode;    //newNode ko banao tail
        }
