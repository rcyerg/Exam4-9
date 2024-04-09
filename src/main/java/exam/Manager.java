package exam;

public class Manager extends Employee{
    private final double EXTRA_DISCOUNT = 0.05d;
    private double salary;

    Manager(String name, Size size) {
        super(name, size);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double priceAfterDiscount = 0;
        priceAfterDiscount = cloth.getPrice() - (((DISCOUNT * cloth.getPrice()) + (EXTRA_DISCOUNT * cloth.getPrice())));
        System.out.println(priceAfterDiscount);
    }

    @Override
    public void printInfo() {

    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
