public class Node<T> {
    T data;
    Node next, previous;

    //Конструктор, создающий полностью пустую ноду
    public Node() {
        next = null;
        previous = null;
        data = null;
    }

    // Конструктор, создающий заполненную ноду
    public Node(T d, Node n, Node p) {
        data = d;
        next = n;
        previous = p;
    }

    public Node(T d) {
        data = d;
    }

    public Node getLinkNext() {
        return next;
    }

    public void setLinkNext(Node n) {
        next = n;

    }

    public Node getLinkPrev() {
        return previous;
    }

    public void setLinkPrev(Node p) {
        previous = p;
    }

    public T getData() {
        return data;
    }

    public void setData(T d) {
        data = d;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}

