 public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next =null;
        }
    }
        public static Node head;
        public static Node tail;
  public void addLast(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = tail =newNode;
            return;
        }
        tail.next =newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
       
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
        System.out.println();
    }
