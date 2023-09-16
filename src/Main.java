
public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtStart("First");
        list.insertAtStart("Second");
        list.insertAtEnd("Cocos");
        list.insertAtEnd(12);
        list.insertAtEnd('c');
        list.showAllData();
    }
}
