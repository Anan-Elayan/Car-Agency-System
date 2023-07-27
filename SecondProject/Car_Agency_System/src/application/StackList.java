package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class StackList {
    private NodeStack topItem;

    public void push(Orders data) {
        NodeStack newNode = new NodeStack(data);
        if (topItem != null) {
            newNode.setNext(topItem);
        }
        this.topItem = newNode;
    }


    public void pop() {
        if (topItem == null) {
            System.out.println("Stack is Empty");
        } else {
            topItem = topItem.getNext();
        }
    }


    public NodeStack getTopItem() {
        return topItem;
    }

    public void setTopItem(NodeStack topItem) {
        this.topItem = topItem;
    }

    public boolean isEmpty() {
        return this.topItem == null;
    }
}
