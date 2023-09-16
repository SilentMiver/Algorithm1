
public class Main {
    public static void main(String[] args) {
//        LinkList list = new LinkList();
//        list.addAtFirst("First");
//        list.addAtFirst("Second");
//        list.add("Cocos");
//        list.add(12);
//        list.add('c');
//
//        list.showAllData();
//        list.insertAt(3, "Вместо кокоса");
//        list.showAllData();
//        list.deleteAt(4);
//        list.showAllData();
//        list.add(new Minion(21,"Samuel"));
//        list.showAllData();

        LinkList<Minion> minionLinkList = new LinkList<Minion>();
        minionLinkList.add(new Minion(21, "Samuel"));
        minionLinkList.showAllData();
        System.out.println("\n" + "Add Samuel");

        minionLinkList.getValueAt(1).setData(new Minion(21, "Goro"));
        minionLinkList.showAllData();
        System.out.println("\n" + "Samuel's name now Goro");

        for (int i = 0; i < 3; i++) {
            minionLinkList.add(new Minion());
        }
        minionLinkList.showAllData();
        System.out.println("\n" + "Add random minions");

        minionLinkList.addAtFirst(new Minion(66, "Jora"));
        minionLinkList.showAllData();
        System.out.println("\n" + "Add minion Jora on top");

        minionLinkList.deleteAt(5);
        minionLinkList.deleteAt(4);
        minionLinkList.showAllData();
        System.out.println("\n" + "Delete minions 4-5");

        minionLinkList.insertAt(3, new Minion(12, "Gosha"));
        minionLinkList.showAllData();
        System.out.println("\n" + "Add Gosha at index 3");

        minionLinkList.add(new Minion());
        minionLinkList.showAllData();
        System.out.println("\n" + "Add random minion");


    }
}
