package behavioural.chainofresponsability.homework;

public class ChainPatternDemo {

    public static PurchaseApproval getChainOfApprovers() {

        PurchaseApproval managerApproval = new ManagerApproval();
        PurchaseApproval vicePresidentApproval = new VicePresidentApproval();
        PurchaseApproval directorApproval = new DirectorApproval();

        managerApproval.setSuccessor(directorApproval);
        directorApproval.setSuccessor(vicePresidentApproval);

        return managerApproval;
    }

    public static void main(String[] args) {

        PurchaseApproval approversChain = getChainOfApprovers();
        approversChain.processRequest(1000);
//        Manager will approve $1000.0
        approversChain.processRequest(5000);
//        Director will approve $5000.0
        approversChain.processRequest(9000);
//        Director will approve $9000.0
        approversChain.processRequest(10000);
//        Vice President will approve $10000.0
        approversChain.processRequest(18000);
//        Vice President will approve $18000.0
        approversChain.processRequest(20000);
    }
}
