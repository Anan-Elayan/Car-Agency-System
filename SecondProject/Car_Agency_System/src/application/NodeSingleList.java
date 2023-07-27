package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class NodeSingleList implements Comparable<NodeSingleList> {

    private Car objectCar;
    private NodeSingleList next;

    public NodeSingleList() {
    }

    public NodeSingleList(Car objectCar) {
        this.objectCar = objectCar;
    }

    public Car getObjectCar() {
        return objectCar;
    }

    public void setObjectCar(Car objectCar) {
        this.objectCar = objectCar;
    }

    public NodeSingleList getNext() {
        return next;
    }

    public void setNext(NodeSingleList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Car Info Node [" +"objectCar=" + objectCar + "] ";
    }

    @Override
    public int compareTo(NodeSingleList o) {
        return Integer.compare(this.getObjectCar().getYear(), o.objectCar.getYear());
    }


    @Override
    public boolean equals(Object obj) {
        return this.objectCar.equals(((NodeSingleList)obj).getObjectCar());
    }
}
