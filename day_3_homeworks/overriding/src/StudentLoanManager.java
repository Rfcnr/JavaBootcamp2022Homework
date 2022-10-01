public class StudentLoanManager extends BaseLoanManager{

    //It was override.
    // It uses the following calculate method, not the base class's calculate method.

    public double calculateLoan(double loanAmount){
        return loanAmount * 1.10;
    }
}
