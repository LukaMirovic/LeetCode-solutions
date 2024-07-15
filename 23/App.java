import java.util.*;
public class App {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode l: lists){
            if(!l.equals(null))
                pq.add(l);
        }
        if(pq.isEmpty()){
            return null;
        }
        ListNode l= new ListNode();
        ListNode retur=l;
        int flag=0;
        while(!pq.isEmpty()){
            if(flag==0){
                l=pq.poll();
                if(l.next!=null){
                    pq.add(l.next);
                } 
                retur=l;
                flag=1;
            }else{
                l.next= new ListNode();
                l=l.next;
                l.val=pq.peek().val;
                ListNode check=pq.poll();
                if(check.next!=null){
                    pq.add(check.next);
                } 
            }
        }
        return retur;
    }
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {1, 4, 5},
            {1, 3, 4},
            {2, 6}
        };

        ListNode[] lists = new ListNode[arrays.length];
        
        for (int i = 0; i < arrays.length; i++) {
            lists[i] = createList(arrays[i]);
        }

        mergeKLists(lists);
    }
}
