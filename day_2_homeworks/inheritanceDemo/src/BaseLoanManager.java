public class BaseLoanManager {

    private String name;

    public void calculateLoan(){
        System.out.println("Calculated The loan for : " + name + ".");
    }

    public void setName(String name) {
        this.name = name;
    }
}
