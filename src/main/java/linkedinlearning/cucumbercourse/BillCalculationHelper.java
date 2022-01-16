package linkedinlearning.cucumbercourse;

public class BillCalculationHelper {

    public static double calculateBillForCustomer(double initialBillAmount, Double taxRate){
        double result = Math.floor((initialBillAmount * taxRate) * 100)/100;
        return result;
    }
}
