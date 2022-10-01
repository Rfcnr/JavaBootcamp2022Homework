public class BaseLoanManager {

    //DAY 3 - Overriding
    // If it is desired to prevent override, the final keyword should be used.
    //For example: "public final double calculateLoan(){...}"
    public double calculateLoan(double loanAmount){
        return loanAmount * 1.18;
    }
}
