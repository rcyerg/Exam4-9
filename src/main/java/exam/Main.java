package exam;

public class Main {
    public static void main(String[] args) {

//            Q1.
        Cloth jeans = new Cloth("Jeans", Size.L);
        jeans.setPrice(15.99);

        Cloth tShirt = new Cloth("T-Shirt", Size.M);
        tShirt.setPrice(10.99);

        Cloth hat = new Cloth("Hat", Size.S);
        hat.setPrice(5.99);

        Cloth[] cloths = {jeans, tShirt, hat};

//            Q2.
        System.out.println(ShopApp.calculateSubTotal(cloths));
        System.out.println("========");

//            Q3a + Q3b
        Student smallStudent = new Student("Billy", Size.S);
        smallStudent.printUniqueStudentID();
        Student extraLargeStudent = new Student("Tommy", Size.XL);
        System.out.println("--------");
        extraLargeStudent.printUniqueStudentID();
        System.out.println("--------");
        smallStudent.printUniqueStudentID();
        System.out.println("========");

//            Q4.
        extraLargeStudent.printInfo();
        System.out.println("========");

//            Q5.
        System.out.println(ShopApp.isAFit(smallStudent, hat));
        System.out.println("========");

//            Q6.
        Manager manager1 = new Manager("Chris", Size.L);
        manager1.setSalary(50_000);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Jim", Size.XL);
        hourlyEmployee1.setHourlyWage(15.00f);
        hourlyEmployee1.setHoursWorked(40);


        Business business1 = new Business("Costco");
        business1.setProductPrice(5.0);
        business1.setProductQtySupplied(100);
//            7a.
        Customer[] customers = {extraLargeStudent, manager1, hourlyEmployee1};

//            7b.
        for (Customer c : customers){
            System.out.println(c.getClass());
            c.printPriceAfterDiscount(jeans);
            System.out.println("---------");
        }
        System.out.println("========");

//            8a.
        business1.setProductPrice(-100);
        System.out.println(business1.getProductPrice());
        System.out.println("========");

//            8b.
        System.out.println(business1.calculatePay());
        System.out.println("========");

//            9a.
        IPayable[] iPayables = {manager1, hourlyEmployee1, business1};

//            9b.
        ShopApp.printClassNamesOfPayableEntities(iPayables);
        System.out.println("========");

//            10a.
        Employee managerToEmployee;

//            10b.
        managerToEmployee = new HourlyEmployee("Josh", Size.L);
        ((HourlyEmployee) managerToEmployee).setHourlyWage(15.00f);
        System.out.println(((HourlyEmployee) managerToEmployee).getHourlyWage());
    }
}
