package Modul3;

public class queue {

    //data member
    protected ChainNode firstNode;
    protected int size;

    //constructors
    public queue(int initialCapacity) {

    }

    public queue() {
        this(10);
    }

    // methods
    public boolean isEmpty() {
        return size == 0;
    }

    public int count() {
        return size;
    }

    public void checkIndex(int size) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("IS EMPTY");
        }
    }

    public Object Peek() {
        checkIndex(size);
        ChainNode currentNode = firstNode;
        for (int i = 0; i < size - 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    public Object pop() {

        Object removeElement = firstNode.element;

        if (size == 0) {
            System.out.println("QUEUE Kosong");
        } else {

            firstNode = firstNode.next;
            System.out.println(removeElement);
        }
        size--;
        return removeElement;
    }

    public void push(Object theElement) {
        if (size == 0) {
            firstNode = new ChainNode(theElement, firstNode);
        } else {
            ChainNode p = firstNode;
            for (int i = 0; i < size - 1; i++) {
                p = p.next;
            }
            p.next = new ChainNode(theElement, p.next);

        }
        size++;
    }

    public void clear() {
        firstNode = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        ChainNode currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.element == null) {
                s.append("null, ");
            } else {
                s.append(currentNode.element.toString() + ",");
            }
            currentNode = currentNode.next;
        }
        if (size > 0) {
            s.delete(s.length() - 1, s.length());
        }
        s.append("]");

        return new String(s);
    }

}
