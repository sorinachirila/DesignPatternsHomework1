package behavioural.chainofresponsability.course;

public class ManagerApproval extends PurchaseApproval {

/*    public ManagerApproval(double base) {
        this.base = base;
    }*/

    protected double getAllowed() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}
