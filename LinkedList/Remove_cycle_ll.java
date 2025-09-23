 public static void removeCycle(){
        //detect cycle
        Node slow =head;
        Node fast =head;
        boolean cycle =false;

        while(fast != null && fast.next !=null) {
            slow =slow.next;
            fast =fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
  
        if( cycle == false){
            return;
        }

        //find meeting point
        slow =head;
        Node prev =null;
        
        while(slow != fast){
            prev =fast;  //last node
            slow =slow.next;
            fast =fast.next;

        }
        //remove cycle
        prev.next = null;
    }

