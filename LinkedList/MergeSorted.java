  public Node getmid(Node head){
 Node slow =head;
    Node fast =head.next;

    while(fast != null && fast.next != null){
        slow =slow.next;
    fast =fast.next.next;

    }
    return slow;
       }


       private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 =head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            }
            while(head1 != null){
                 temp.next = head1;
                head1 =head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                 temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

        }
        return mergeLL.next; // head nahi karenge kyuki waha dummy node hai -1 to next se return karenge
       }

       public Node sort(Node head){
        if(head == null || head.next == null){
            return head;
        }
    //find mid
    Node mid =getmid(head);

    //left & right
    Node righthead =mid.next;
      mid.next =null;
      Node left =sort(head);
      Node right =sort(righthead);

    //merge
    return merge(left , right);

       }
