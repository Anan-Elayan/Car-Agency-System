package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class SingleLinkedList {

    private NodeSingleList first;
    private NodeSingleList last;
    private int count = 0;


    // to return first node from single linked list
    public NodeSingleList getFirst() {//O(1)
        return this.first;
    }


    // to return last node from single linked list
    public NodeSingleList getLast() {
        return this.last;
    }


    // in this method remove first node;O(1)
    public boolean removeFirst() {
        if (count == 0) {
            return false;
        } else if (count == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.getNext();
        }
        count--;
        return true;
    }


    // in this method remove last node;O(n)
    public boolean removeLast() {
        if (count == 0) {
            return false;
        } else if (count == 1) {
            this.first = null;
            this.last = null;
        } else {
            NodeSingleList temp = this.first;
            for (int i = 0; i < count - 2; i++) {
                temp = temp.getNext();
            }
            this.last = temp;
            this.last.setNext(null);
        }
        count--;
        return true;
    }


    // in this method remove last node;
    public boolean removeAtIndex(int index) {
        if (index == 0) {
            return removeFirst();
        } else if (index == count) {
            return removeLast();
        } else if (index <= 0 || index > count) {
            return false;
        } else {
            NodeSingleList prev = null;
            NodeSingleList temp = null;
            temp = this.first;
            for (int i = 0; i < index; i++) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
            temp.setNext(null);
            count--;
        }
        return true;
    }


    // in this method that remove object ;
    public boolean removObj(NodeSingleList target) {

        if (count == 0) {
            return false;
        }
        if (this.first.getObjectCar() == target.getObjectCar()) {
            return removeFirst();
        } else if (this.last.getObjectCar() == target.getObjectCar()) {
            return removeLast();
        } else {
            NodeSingleList prev = null;
            NodeSingleList temp = this.first;
            for (int i = 0; i < count; i++) {
                if (target.getObjectCar() == temp.getObjectCar()) {
                    prev.setNext(temp.getNext());
                    count--;
                    return true;
                }
                prev = temp;
                temp = temp.getNext();
            }
        }
        return false;
    }


    // in this method that search specific object ;
//    public SingleLinkedList search(String name) {
//        SingleLinkedList sList = new SingleLinkedList();
//        NodeSingleList temp = this.first;
//        while (temp != null) {
//            if (temp.getObjectCarInfo().getBrand().toLowerCase().contains(name.toLowerCase())) {
//                sList.addLast(new NodeSingleList(temp.getObjectCarInfo()));
//            }
//            temp = temp.getNext();
//        }
//        return sList;
//    }


    // in this method we need to add node at header
    public void addFirst(NodeSingleList target) {
        if (count == 0) {
            this.first = this.last = target;
        } else {
            target.setNext(this.first);
            this.first = target;
        }
        count++;
    }


    // in this method we need to add node at tail
    public void addLast(NodeSingleList target) {
        if (count == 0) {
            this.first = this.last = target;
        } else {
            this.last.setNext(target);
            this.last = target;
        }
        count++;
    }


    public void addNodeSorted(NodeSingleList newNode) { // O(n)
        if (count == 0 && newNode != null) { // Nothing any node
            addFirst(newNode);
        } else {
            if (newNode != null) { //exit
                NodeSingleList temp = newNode;
                NodeSingleList current = this.first;
                NodeSingleList previous = null;
                if (newNode.compareTo(current) < 0) {
                    addFirst(newNode);
                } else {
                    while ((current != null) && (newNode.compareTo(current) >= 0)) {
                        previous = current;
                        current = current.getNext();
                    }
                    previous.setNext(temp);
                    if (current == null)
                        this.last = temp;
                    temp.setNext(current);
                    this.count++;
                }
            }

        }

    }


    // in this method we need to add node at tail
    public void addNode(NodeSingleList target, int index) {
        NodeSingleList temp = this.first;
        if (count == 0) {
            this.first = this.last = target;
            addFirst(target);
        } else if (index <= 0) {
            addFirst(target);
        } else if (index > count) {
            addLast(target);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            target.setNext(temp.getNext());
            temp.setNext(target);
            count++;
        }
    }


    public int size() {
        return count;
    }


    @Override
    public String toString() {
        String s = "";
        NodeSingleList curent = first;
        while (curent != null) {
            s += curent + "\n";
            curent = curent.getNext();
        }
        return s;
    }


    // print list
    public void printList() {
        NodeSingleList temp = first;
        if (count == 0) {
            return;
        }
        while (temp != null) {
            temp = temp.getNext();
        }
    }


}
