import java.util.*;

public class MyList<E> implements List<Candies> {

    private Candies[] candies;
    private Node head;
    private Node tail;
    private int size;

    public MyList() {

    }

    public MyList(Candies candy) {
        add(candy);
    }

    public MyList(Collection collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Candies candy : this) {
            if (o.toString().equals(candy.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Candies> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Candies> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Candies next() {
            try {
                Candies candy = currentNode.getCandy();
                currentNode = currentNode.getNext();
                return candy;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Candies candy) {
        Node node = new Node(candy, null);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)) {
            o.next
        }
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Candies> collection) {
        boolean isCollectionChanged = false;
        for (Candies candies : collection) {
            isCollectionChanged |= add(candies);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Candies> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Candies get(int i) {
        return null;
    }

    @Override
    public Candies set(int i, Candies candy) {
        return null;
    }

    @Override
    public void add(int i, Candies candy) {

    }

    @Override
    public Candies remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Candies> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Candies>{
        private Node currentNode = head;
        private Node previousNode = null;
        int index = 0;
        @Override
        public boolean hasNext() {
            return currentNode.getNext() != null;
        }
        @Override
        public Candies next() {
            try {
                Candies candy = currentNode.getCandy();
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                index ++;
                return candy;
            } catch (NullPointerException e) {
                return null;
            }
        }

        public boolean hasPrevious() {
            return previousNode != null;
        }

        public Candies previous() {
            Candies candy = previousNode.getCandy();
            Node currentNodeInside = head;
            for (int i = 0; i < index-1; i++) {
                previousNode = currentNodeInside;
                currentNodeInside = currentNodeInside.getNext();
            }
            currentNode = currentNodeInside;
            index--;
            return candy;
        }

        public int previousIndex() {
            return index-2;
        }

        @Override
        public int nextIndex() {
            return index;
        }

        @Override
        public void remove(Candies candy) {
            for  {

            }
        }

        @Override
        public void set(Candies candy) {

        }

        @Override
        public void add(Candies candy) {

        }

    }

    @Override
    public ListIterator<Candies> listIterator(int i) {
        return null;
    }

    @Override
    public List<Candies> subList(int i, int i1) {
        return null;
    }
}
