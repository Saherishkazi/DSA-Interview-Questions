 public void addLast(int data){
        Node newNode  = new Node(data);
        size++;
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
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println();
    }
