/*
Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

Code
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp != null && temp.next!=null){
        if(temp.val==temp.next.val){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
        }
        return head;
    }
}
