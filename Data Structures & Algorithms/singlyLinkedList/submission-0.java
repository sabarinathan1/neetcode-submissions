
class LinkedList {
    class LinkedListNode {
        private int val;
        private LinkedListNode next;
        public LinkedListNode(int val, LinkedListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private LinkedListNode head;

    public LinkedList() {
        head = null; // initially empty
    }

    public int get(int index) {
        int i = 0;
        LinkedListNode current = head;
        while (current != null) {
            if (i == index) {
                return current.val;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        head = new LinkedListNode(val, head);
    }

    public void insertTail(int val) {
        if (head == null) {
            head = new LinkedListNode(val, null);
            return;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(val, null);
    }

    public boolean remove(int index) {
        if (index < 0) return false;
        if (index == 0) {
            if (head != null) {
                head = head.next;
                return true;
            } else {
                return false;
            }
        }

        LinkedListNode current = head;
        int i = 0;
        while (current != null && current.next != null) {
            if (i + 1 == index) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
            i++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list;
    }
}
