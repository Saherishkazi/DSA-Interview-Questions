public boolean palindrome(int n){
    if(head == null || head.next == null){
        return true;
    }
    //find mid
    int mid =findMid(head);

    //reverse
   
Node prev =null;
Node curr =mid;
Node next;

while(curr != null){
   next =curr.next;
curr.next =prev;
prev =curr;
curr =next;
}
Node right =prev;
Node left =head;

//check
while(right != null){
    if(left.data != right.data){
        return false;
   left =left.next;
   right =right.next;
}
return true;

}
