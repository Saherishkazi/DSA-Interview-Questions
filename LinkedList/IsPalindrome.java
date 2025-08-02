 public boolean checkPlindrome(){
        //base
        if(head == null && head.next ==null){
            return true;
        }
        //1- find mid
        Node midNode = findmid(head);

        //2-reverse 2nd hald
        Node prev =null;
        Node curr =midNode;
        Node next;

        while(curr != null){
            next =curr.next;
            curr.next = prev;
            prev =curr;
            curr =next;
        }
       Node left = head;
       Node right = prev;
        //3- check left and right half
        while(right != null){

            while(left.data != right.data){
                return false;
            }
            left =left.next;
            right = right.next;
        }
        return true;
    }
