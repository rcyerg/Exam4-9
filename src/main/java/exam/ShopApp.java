package exam;

public class ShopApp {
    public static boolean isAFit(Customer customer, Cloth cloth){
        return customer.getSize() == cloth.getSize();
    }
    public static double calculateSubTotal(Cloth[] cloths){
        double SubTotal = 0;
        for (Cloth c : cloths){
            SubTotal += c.getPrice();
        }
        return SubTotal;
    }

    public static void printClassNamesOfPayableEntities(IPayable[] payables){
        for (IPayable p : payables){
            System.out.println(p.getClass());
            System.out.println("-------");
        }
    }
}
