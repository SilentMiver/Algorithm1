public class LinkList<T> {
    protected Node start; //сс
    protected Node end;
    public int size;
    public LinkList() {
        start = null;
        end = null;
        size = 0;
    }
    public void insertAtEnd(T val) {
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
    public void insertAtStart(T val) {
        Node newnode = new Node(val, null, null);
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
