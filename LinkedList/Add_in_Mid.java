 public void addMid(int data, int idx){
        Node newNode = new Node(data);
        Node temp =head;
        int i =0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
