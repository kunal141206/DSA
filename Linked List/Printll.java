public class Printll {
        public static class  Node {
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        public static Node tail;
        public  void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void add(int idx,int data){
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i < idx-1) {
                temp = temp.next;
                i++;
            }
            //if i = idx-1
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public static void printl(){
            if(head == null){
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
            }
                System.out.println();
        }
        public void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
                head = prev;
        }
    public static void main(String[] args) {
        
    }    
}
