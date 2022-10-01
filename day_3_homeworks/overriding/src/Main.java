public class Main {
    public static void main(String[] args) {

        //DAY 3 - Overriding
        BaseLoanManager[] baseLoanManagers = new BaseLoanManager[]
                {new AgriculturalLoanManager(), new TeacherLoanManager(), new StudentLoanManager()};

        for (BaseLoanManager loanManager:baseLoanManagers){
            System.out.println(loanManager.calculateLoan(10000));
        }
    }
}