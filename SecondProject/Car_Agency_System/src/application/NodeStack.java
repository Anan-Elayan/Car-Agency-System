package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class NodeStack {

    private Orders order;
    private NodeStack next;

    public NodeStack(Orders order){
        this.order=order;
        this.next=null;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public NodeStack getNext() {
        return next;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeStack{" +
                ", order=" + order +
                ", next=" + next +
                '}';
    }
}
