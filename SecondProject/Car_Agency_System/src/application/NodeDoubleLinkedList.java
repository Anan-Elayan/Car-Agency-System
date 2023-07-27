package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class NodeDoubleLinkedList implements Comparable<NodeDoubleLinkedList> {

    private String brand ;
    private SingleLinkedList listCarInfo;
    private NodeDoubleLinkedList next;
    private NodeDoubleLinkedList previous;

    public NodeDoubleLinkedList(String brand, SingleLinkedList listCarInfo) {
        this.brand = brand;
        this.listCarInfo = listCarInfo;
    }

    public NodeDoubleLinkedList(String brand) {
        this.brand = brand;
        listCarInfo= new SingleLinkedList();
    }


    public NodeDoubleLinkedList() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public SingleLinkedList getListCarInfo() {
        return listCarInfo;
    }

    public void setListCarInfo(SingleLinkedList listCarInfo) {
        this.listCarInfo = listCarInfo;
    }

    public NodeDoubleLinkedList getNext() {
        return next;
    }

    public void setNext(NodeDoubleLinkedList next) {
        this.next = next;
    }

    public NodeDoubleLinkedList getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDoubleLinkedList previous) {
        this.previous = previous;
    }


    @Override
    public String toString() {
        return "NodeDoubleLinkedList [brand=" + brand + "]";
    }

    @Override
    public int compareTo(NodeDoubleLinkedList o) {
        return this.getBrand().compareToIgnoreCase(o.getBrand());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getBrand().equalsIgnoreCase(((NodeDoubleLinkedList)obj).getBrand());
    }

}
