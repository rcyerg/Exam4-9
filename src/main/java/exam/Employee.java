package exam;

public abstract class Employee extends Customer implements IPayable{
    protected final double DISCOUNT = 0.10d;


    Employee(String name, Size size) {
        super(name, size);

    }

}
