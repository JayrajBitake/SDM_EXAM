import java.util*;

public class LinkList {
    LinkedList<String> ll = new LinkedList<String>();
    Scanner sc = new Scanner(System.in);

    public static void insertAtend() {
        int ch;
        Switch(ch){

            case1:
            System.out.print("enter value to be inseted");
            String s=sc.NextLine();
            ll.add(s);
            break;
            default:
             System.out.print("Wrong choice");

        }
        
      

    }

    public static void display() {
        System.out.print(l1);
    }

    public static void main(String args[]) {

        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        insertAtend();
        display();

    }

}