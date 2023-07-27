package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class DoubleLinkedList {

    private NodeDoubleLinkedList first;
    private NodeDoubleLinkedList last;
    private int counter = 0;



    public NodeDoubleLinkedList getFirst() {
        return this.first;
    }



    public NodeDoubleLinkedList getLast() {
        return this.last;
    }




    public void addFirst(NodeDoubleLinkedList newNode) {
        if (this.counter == 0) {
            this.first = this.last = newNode;
        } else {
            newNode.setNext(this.first);
            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.first.setPrevious(newNode);
            this.first = newNode;
        }
        counter++;
    }





    public void addLast(NodeDoubleLinkedList newNode) {
        if (counter == 0) {
            this.first = this.last = newNode;
        } else {
            newNode.setPrevious(this.last);
            newNode.setNext(this.first);
            this.last.setNext(newNode);
            this.first.setPrevious(newNode);
            this.last = newNode;
        }
        counter++;
    }





    public void add(NodeDoubleLinkedList newNode, int index) {
        NodeDoubleLinkedList curent;
        if (index >= counter) {
            addLast(newNode);
        } else if (index <= 0) {
            addFirst(newNode);
        } else {
            curent = this.first;
            for (int i = 0; i < index; i++) {
                curent = curent.getNext();
            }
            newNode.setNext(curent.getNext());
            newNode.setPrevious(curent);
            curent.getNext().setPrevious(newNode);
            curent.setNext(newNode);
            counter++;
        }
    }





    public boolean removeObj(NodeDoubleLinkedList location) {
        NodeDoubleLinkedList curent = this.first;
        NodeDoubleLinkedList Previous = null;
        if (counter == 0) {
            return false;
        } else {
            while (!(curent.equals(location))) {
                Previous = curent;
                curent = curent.getNext();
            }
            if (curent.equals(last)) {
                Previous.setNext(this.first);
                this.last = Previous;
            } else if (curent.equals(first)) {
                this.last.setNext(curent.getNext());
                first = curent.getNext();
                first.setPrevious(this.last);
            } else {
                Previous.setNext(curent.getNext());
                curent.getNext().setPrevious(Previous);
                curent.setNext(null);
                curent.setPrevious(null);
            }
            counter--;
        }
        return true;
    }





    public boolean removeFirst() {
        NodeDoubleLinkedList temp = this.first;
        if (counter == 0) {
            return false;
        } else if (counter == 1) {
            this.first = this.last = null;

        } else {
            this.first = this.first.getNext();
            this.last.setNext(this.first);
            this.first.setPrevious(last);
            temp.setNext(null);
        }
        counter--;
        return true;
    }






    public boolean removeLast() {
        NodeDoubleLinkedList temp = this.first;
        if (this.counter == 0) {
            return false;
        } else {
            for (int i = 0; i < counter; i++) {
                temp = temp.getNext();
            }
            temp.setNext(this.first);
            this.first.setPrevious(temp);
            temp = this.last;
            this.last.setNext(null);
        }
        counter--;
        return true;
    }




    public boolean removeAt(int index) {
        NodeDoubleLinkedList temp = this.first;
        NodeDoubleLinkedList prev = null;
        if (index == 0) {
            return removeFirst();
        } else if (index == counter) {
            return removeLast();

        } else if (index > counter) {
            return false;
        } else if (index < 0) {
            return false;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
                prev = temp;
            }
            temp.setPrevious(prev.getPrevious());
            prev.getPrevious().setNext(prev.getNext());
            prev.setPrevious(null);
            prev.setNext(null);
            counter--;
            return true;
        }
    }






    // in this method to search for specific node by location
    public NodeDoubleLinkedList search(String brand) {
        NodeDoubleLinkedList temp = this.first;
        for (int i = 0; i < counter; i++) {
            if (temp.getBrand().equalsIgnoreCase(brand)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }





    // in this method to store info from file in double linkedList sorted  O(n)
    public void addNodeSorted(NodeDoubleLinkedList newNode) {
        if (counter == 0 && newNode != null) { //nothing any node and new node not empty
            addFirst(newNode);
        } else {
            if (newNode != null) { //not empty
                NodeDoubleLinkedList current = this.first;
                NodeDoubleLinkedList previous = null;
                if (newNode.compareTo(current) < 0) {
                    addFirst(newNode);
                } else {
                    int count = 0;
                    while ((count != this.counter) && (newNode.compareTo(current) > 0)) {
                        previous = current;
                        current = current.getNext();
                        count++;
                    }
                    if (count == this.counter) { //at the end list
                        this.addLast(newNode);
                    } else {
                        newNode.setNext(current);
                        newNode.setPrevious(previous);
                        current.setPrevious(newNode);
                        previous.setNext(newNode);
                        this.counter++;
                    }
                }
            }
        }
    }




    // print list
    public void printList() {
        NodeDoubleLinkedList temp = this.first;
        if (counter == 0) {
            return;
        }
        for (int i = 0; i < counter; i++) {
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }




    // to return who many node;
    public int size() {
        return counter;
    }




    @Override
    public String toString() {
        return "DoublyLinkedList [first=" + first + ", last=" + last + ", count=" + counter + "]";
    }
}
