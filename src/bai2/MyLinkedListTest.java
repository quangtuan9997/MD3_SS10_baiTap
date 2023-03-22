package bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>("hùng");
        mylist.add("Nam");
        mylist.add(1,"Thế Em");
        mylist.add("Mến Bơm");
        mylist.add("Tuấn Em");
        mylist.add("Minh");
        mylist.remove(2);
        mylist.printList();
        mylist.remove("Minh");
        mylist.printList();
        mylist.addFirst("lam nghien");
        mylist.printList();
    }
}
