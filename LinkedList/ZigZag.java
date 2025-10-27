 public void zigzag(Node head){
        //mid
        Node slow= head;
        Node fast =head.next;

        while(fast != null && fast.next != null){
            slow =slow.next;
            fast =fast.next.next;
        }
        Node mid= slow;
        //reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev =null;
        Node next;


        while(curr != null){
            next =curr.next;
            curr.next =prev;
            prev =curr;
            curr =next;
        }
        //return prev
        
        //alternate zigzag
        Node LH = head;
        Node RH = prev;
        Node Lnext, Rnext;

        while(LH != null && RH != null){
            Lnext =LH.next;
            LH.next =RH;
            Rnext =RH.next;
            RH.next = Lnext;

            //update
            RH =Rnext;
            LH =Lnext;

        }
    }
