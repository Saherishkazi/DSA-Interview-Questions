public int removeFirst(){
            if(head == null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val =head.data;
                head =tail =null;
                size--;
                return val;
            }
            int val = head.data;
            head =head.next; //head banao head ke next ko->
            head.prev =null; //pre ko null   <-
            size--;
            return val;

        }
