public class circularLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
 
        public Node(int data){
            this.data = data;
            this.next =null;
            this.prev =null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

    public static void addF(int data){
        Node newNode =new Node(data);
        size++;
        size++;
        if(head == null){
            head =tail=newNode;
            tail.next =head;
            return;
        }
        newNode.next =head;
        head =newNode;
        tail.next =newNode;
       
    }
    public static void print(){
        if(head ==  null){
            System.out.println("empty");
            return;
        }

        Node temp =head;
        do{
            System.out.print(temp.data +"->");
            temp =temp.next;

        }
            //circular ll hai to null nahi aayega tail.next point karenga direct head ko
            while(temp != head);
                System.out.println("back to head");
            

    }
public static void main(String arg[]){
        circularLL cll =new circularLL();
        cll.addF(5);
        cll.addF(4);
        cll.addF(3);
        cll.addF(2);
        cll.addF(1);
        // cll.print();
