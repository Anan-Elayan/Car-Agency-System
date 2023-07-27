package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {

    private String brand;
    private Client client;
    private Car carInfo;
    private Date orderDate;
    private String orderStatus;

    public Orders() {
    }

    public Orders(Car carInfo) {
        this.carInfo = carInfo;
    }

    public Orders(Client client, Car carInfo, Date orderDate, String orderStatus, String brand) {
        this.client = client;
        this.carInfo = carInfo;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.brand = brand;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Car carInfo) {
        this.carInfo = carInfo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        DateFormat format = new SimpleDateFormat("d/M/yyyy");
        return client.getName() + ", " + client.getPhone() + ", " + brand + "," +
                carInfo.getModel() + "," + carInfo.getYear() + "," + carInfo.getColor() + ","
                + carInfo.getPrice() + "K, " + format.format(orderDate) + ", " + orderStatus+"\n";
    }
}
