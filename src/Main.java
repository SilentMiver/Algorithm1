
public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addAtFirst("First");
        list.addAtFirst("Second");
        list.add("Cocos");
        list.add(12);
        list.add('c');

        list.showAllData();
        list.insertAt(3, "Вместо кокоса");
        list.showAllData();
        list.deleteAt(4);
        list.showAllData();
    }
}
