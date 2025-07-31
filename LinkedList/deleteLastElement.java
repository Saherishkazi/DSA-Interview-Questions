 public int delteL(){
        //2 special cases
        
        if(size == 0){
            System.out.println("empty");
        }else{
            if(size == 1){
                int val =head.data;
                head =tail=null;
                return val;
            }
        }
        Node prev =head;
        for(int i=0 ;i<size-2;i++){
            prev = prev.next;
           
        }
        int val = head.data;
       prev.next =null;
       tail = prev;
       size--;
       return val;
    }


