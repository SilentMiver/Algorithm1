
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
        list.add(new Minion(21,"Samuel"));
        list.showAllData();
        LinkList<Minion> minionLinkList = new LinkList<Minion>();
        minionLinkList.add(new Minion(21,"Samuel"));
        minionLinkList.showAllData();
        minionLinkList.getValueAt(1).setData(new Minion(1,"Goro"));

        minionLinkList.showAllData();
    }
}
