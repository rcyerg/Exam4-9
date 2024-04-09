package exam;

public class Student extends Customer{

    public static long studentID = 0;
    private final double DISCOUNT = 0.05d;

    private long IDCounter;


    Student(String name, Size size) {
        super(name, size);
        IDCounter = studentID;
        studentID++;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double priceAfterDiscount = 0;
        priceAfterDiscount = cloth.getPrice() - (DISCOUNT * cloth.getPrice());
        System.out.println(priceAfterDiscount);
    }


    public void printUniqueStudentID(){
        System.out.println(IDCounter);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + this.getName() + '\'' +
                ", size= '" + this.getSize() + '\'' +
                ", DISCOUNT= '" + DISCOUNT + '\'' +
                ", IDCounter= '" + IDCounter +  '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        {
            System.out.println(this.toString());
        }
    }


}
