public class LinkList<T> {
    public int size;
    protected Node start; //сс
    protected Node end;

    public LinkList() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAt(int index, T value) {
        Node newnode = new Node(value, null, null);
        if (index == 1) {
            addAtFirst(value);
            return;
        }
        Node pointer = start;
        for (int i = 2; i <= size; i++) {
            if (i == index) {
                Node temp = pointer.getLinkNext();
                pointer.setLinkNext(newnode);
                newnode.setLinkPrev(pointer);
                newnode.setLinkNext(temp);
                temp.setLinkPrev(newnode);
            }
            pointer = pointer.getLinkNext();
        }
        size++;
    }

    public void deleteAt(int index) {
        if (index == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--;
            return;
        }
        if (index == size) {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size--;
        }
        Node pointer = start.getLinkNext();
        for (int i = 2; i <= size; i++) {
            if (i == index) {
                Node previous = pointer.getLinkPrev();
                Node next = pointer.getLinkNext();

                previous.setLinkNext(next);
                next.setLinkPrev(previous);
                size--;
                return;
            }
            pointer = pointer.getLinkNext();
        }
    }

    public Node getValueAt(int index) {
        if (index == 1) {
            return start;
        }
        if (index == size) {
            return end;
        }
        Node pointer = start;
        for (int i = 2; i <= size; i++) {
            if (i == index) {
                return pointer;
            }
            pointer = pointer.getLinkNext();


        }
        return null;
    }


    public void add(T val) {
        Node newnode = new Node(val, null, null);
        if (start == null) {
            start = newnode;
            end = start;
        } else {
            newnode.setLinkPrev(end);
            end.setLinkNext(newnode);
            end = newnode;
        }
        size++;
    }

    public void addAtFirst(T value) {
        Node newnode = new Node(value, null, null);
        if (start == null) {
            start = newnode;
            end = start;
        } else {
            start.setLinkPrev(newnode);
            newnode.setLinkNext(start);
            start = newnode;
        }
        size++;
    }

    public void showAllData() {
        System.out.print("\nDoubly Linked List = { ");
        if (size == 0) {
            System.out.print("empty }\n");
            return;
        }
        if (start.getLinkNext() == null) {
            System.out.println(start.getData() + " }");
            return;
        }
        Node node_var = start;
        System.out.print(start.getData() + " --- ");
        node_var = start.getLinkNext();
        while (node_var.getLinkNext() != null) {
            System.out.print(node_var.getData() + " --- ");
            node_var = node_var.getLinkNext();
        }

        System.out.print(node_var.getData() + " }" + "\n");

    }
}
