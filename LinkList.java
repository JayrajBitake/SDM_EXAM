import java.util*;

public class LinkList {
    LinkedList<String> ll = new LinkedList<String>();

    public void insertAtend() {
        ll.add("E");
        ll.add("G");
        ll.add("E");

    }

    public static void main(String args[]) {

        // LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

    }

}