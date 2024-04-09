package exam;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public Size getSize() {
        return size;
    }

    public Cloth(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }
}
