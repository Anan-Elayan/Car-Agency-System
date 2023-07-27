package application;
/*
 * Name :Anan Elayan
 * ID : 1211529
 *
 * */
public class Summary {
    private String brand;
    private int noInProcess, noSolid, highPrice, lowPrice;

    public Summary() {

    }

    public Summary(String brand, int noInProcess, int noSolid, int highPrice, int lowPrice) {
        this.brand = brand;
        this.noInProcess = noInProcess;
        this.noSolid = noSolid;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoInProcess() {
        return noInProcess;
    }

    public void setNoInProcess(int noInProcess) {
        this.noInProcess = noInProcess;
    }

    public int getNoSolid() {
        return noSolid;
    }

    public void setNoSolid(int noSolid) {
        this.noSolid = noSolid;
    }

    public int getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(int highPrice) {
        this.highPrice = highPrice;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }
}
