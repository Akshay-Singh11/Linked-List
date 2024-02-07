package Node;

public class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
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