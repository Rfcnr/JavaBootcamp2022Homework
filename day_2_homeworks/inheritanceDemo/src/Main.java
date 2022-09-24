public class Main {
    public static void main(String[] args) {

        //DAY 2 - Inheritance - (IMPORTANT SUBJECT)

        LoanUI loanUI = new LoanUI();

        // A constructor method has been created in child classes to print names.
        loanUI.calculateLoan(new TeacherLoanManager("Teacher Loan Manager"));
        loanUI.calculateLoan(new AgriculturalLoanManager("Agricultural Loan Manager"));
        loanUI.calculateLoan(new MilitaryLoanManager("Military Loan Manager"));
    }
}