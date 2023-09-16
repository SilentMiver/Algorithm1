public class LinkList<T> {
    protected Node start; //сс
    protected Node end;
    public int size;
    public LinkList() {
        start = null;
        end = null;
        size = 0;
    }
    public void insertAtStart(T val) {
        Node nptr = new Node(val, null, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }

    public void showAllData() {
        System.out.print("\nDoubly Linked List = { ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData() + " --- ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null) {
            System.out.print(ptr.getData() + " --- ");
            ptr = ptr.getLinkNext();
        }

        System.out.print(ptr.getData() + " }" + "\n");

    }
}
