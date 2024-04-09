package exam;

import java.util.Dictionary;

public class HourlyEmployee extends Employee {
    private float hoursWorked;
    private float hourlyWage;


    public void setHoursWorked(float hoursWorked) {
        if (hoursWorked > 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    public void setHourlyWage(float hourlyWage) {
        if (hourlyWage > 0) {
            this.hourlyWage = hourlyWage;
        }
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    HourlyEmployee(String name, Size size) {
        super(name, size);
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double priceAfterDiscount = 0;
        priceAfterDiscount = cloth.getPrice() - (DISCOUNT * cloth.getPrice());
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
