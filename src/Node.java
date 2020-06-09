public class Node {
    private Candies candy;
    private Node next;

    public Node(Candies candy, Node next) {
        this.candy = candy;
        this.next = next;
    }

    public void setNext( Node next) {
        this.next = next;
    }

    public Candies getCandy() {
        return candy;
    }

    public Node getNext() {
        return next;
    }
}
