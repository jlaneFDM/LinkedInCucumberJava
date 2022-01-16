package linkedinlearning.cucumbercourse;

public class BillCalculationHelper {

    public static double calculateBillForCustomer(Double initialBillAmount, Double taxRate){
        double result = Math.floor((initialBillAmount * taxRate) * 100)/100;
        return result;
    }
}
