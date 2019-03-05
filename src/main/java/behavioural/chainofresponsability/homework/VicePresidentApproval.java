package behavioural.chainofresponsability.homework;

public class VicePresidentApproval extends PurchaseApproval {

/*    public VicePresidentApproval(double base) {
        this.base = base;
    }*/

    protected double getAllowed() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}
