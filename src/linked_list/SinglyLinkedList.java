package linked_list;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current!= null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insert(int position,int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }
    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void delete(int position){
        //position is valid and starting from 1
        if (position ==  1){
            head = head.next;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous=  previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean findElement(ListNode head,int searchKey){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current!= null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){
            next= current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddleNode(){
        if (head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return null;
        }
        if (n <= 0){
            throw new IllegalArgumentException("Invalid value: n = "+ n);
        }
        ListNode main = head;
        ListNode ref = head;

        int count = 0;

        while (count < n){
            if (ref == null){
                throw new IllegalArgumentException(n + " is greater than the numbers of nodes in list");
            }
            ref = ref.next;
            count++;
        }
        while (ref != null){
            ref = ref.next;
            main = main.next;
        }
        return main;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second =  new ListNode(1);
        ListNode third =  new ListNode(2);
        ListNode fourth = new ListNode(5);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
    }
}
