package behavioural.chainofresponsability.course;

public class DirectorApproval extends PurchaseApproval {

/*    public DirectorApproval(double base) {
        this.base = base;
    }*/

    protected double getAllowed() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}
