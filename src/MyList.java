import java.awt.*;
import java.util.LinkedList;

// разворот односвязного списка
public class MyList {
    Node head;

    public void add(String str) {
        Node node = new Node();
        node.value = str;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) head = currentNode;
        else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }


    public int size() {
        int count = 1;
        if (head == null) return 0;
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
            count++;
        }
        return count;
    }

    public String get(int item) {
        if (item > size() - 1) throw new ArrayIndexOutOfBoundsException();
        Node tmp = head;
        while (item > 0) {
            tmp = tmp.next;
            item--;
        }
        return tmp.value;
    }

}

class Node{
    String value;
    Node next;
}