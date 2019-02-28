package behavioural.chainofresponsability.course;

public abstract class PurchaseApproval {

    protected final static double BASE = 500d;

    //protected double base;

    //next element in chain of responsability
    protected PurchaseApproval successor;

    abstract protected double getAllowed();

    abstract protected String getRole();

    public void setSuccessor(PurchaseApproval successor) {
        this.successor = successor;
    }

    public void processRequest(double cost) {
        if (cost < getAllowed()) {
            System.out.println(getRole() + " will approve $" + cost);
        }
        if (successor != null) {
            successor.processRequest(cost);
        }
    }

}
