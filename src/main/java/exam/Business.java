package exam;

public class Business implements IPayable{
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        if (productQtySupplied > 0) {
            this.productQtySupplied = productQtySupplied;
        }
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice > 0) {
            this.productPrice = productPrice;
        }
    }

    Business(String name){
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return productPrice * productQtySupplied;
    }
}
