public class LinkList {
    protected Node start; //сс
    protected Node end;
    public int size;
    public LinkList() {
        start = null;
        end = null;
        size = 0;
    }
    public void insertAtStart(int val) {
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

    @Override
    public String toString() {
        return "LinkList{" +
                "start=" + start +
                ", end=" + end +
                ", size=" + size +
                '}';
    }
}
